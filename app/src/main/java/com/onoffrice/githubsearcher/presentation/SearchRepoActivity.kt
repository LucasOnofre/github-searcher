package com.onoffrice.githubsearcher.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onoffrice.githubsearcher.R
import com.onoffrice.githubsearcher.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchRepoActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: GithubViewModel by viewModel()

    private val viewBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewModel.getRepositories()
    }
}