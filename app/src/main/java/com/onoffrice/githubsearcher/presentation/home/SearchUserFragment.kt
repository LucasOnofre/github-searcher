package com.onoffrice.githubsearcher.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.onoffrice.githubsearcher.R
import com.onoffrice.githubsearcher.databinding.FragmentSearchUserBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

private lateinit var binding: FragmentSearchUserBinding

class SearchUserFragment : Fragment(R.layout.fragment_search_user) {

    private val viewModel: SearchUsersViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchUserBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObservables()
        viewModel.getUser("lucasOnofre")
    }

    private fun setObservables() {
        viewModel.resultSuccess.observe(viewLifecycleOwner) {
            binding.name.text = it?.name
        }
    }
}