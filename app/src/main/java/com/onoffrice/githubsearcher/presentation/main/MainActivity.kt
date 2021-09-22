package com.onoffrice.githubsearcher.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onoffrice.githubsearcher.R
import com.onoffrice.githubsearcher.databinding.ActivityMainBinding
import com.onoffrice.githubsearcher.presentation.home.SearchGithubUsersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val searchUserViewModel: SearchGithubUsersViewModel by viewModel()

    private val viewBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        searchUserViewModel.getRepositories("lucasOnofre")

    }
}