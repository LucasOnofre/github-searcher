package com.onoffrice.githubsearcher.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.onoffrice.githubsearcher.R
import com.onoffrice.githubsearcher.databinding.FragmentSearchUserBinding
import com.onoffrice.githubsearcher.presentation.model.UserPresentation
import com.squareup.picasso.Picasso
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
        setListeners()
    }

    private fun setListeners() {
        binding.searchUserBtn.setOnClickListener {
            if (binding.searchUser.text.isNullOrEmpty().not()) {
                viewModel.getUser(binding.searchUser.text.toString())
            }
        }
    }

    private fun setObservables() {
        viewModel.resultSuccess.observe(viewLifecycleOwner) { userResult ->
            userResult?.let {
                binding.resultContainer.isVisible = true

                binding.userName.text = it.name
                binding.userNick.text = it.login
                setupUserImg(it)
                binding.userFollowing.text = it.following.toString()
                binding.userFollowers.text = it.followers.toString()
            }

        }
    }

    private fun setupUserImg(userModel: UserPresentation?) {
        userModel?.avatarUrl?.let { avatarUrl ->
            if (avatarUrl.isNotEmpty()) {
                Picasso.get()
                    .load(avatarUrl)
                    .error(R.drawable.ic_error)
                    .into(binding.userImg);
            } else {
                binding.userImg.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.ic_person
                    )
                )
            }
        }
    }
}