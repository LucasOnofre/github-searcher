package com.onoffrice.githubsearcher.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onoffrice.githubsearcher.R
import com.onoffrice.githubsearcher.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class YourActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: YourViewModel by viewModel() // Injetando a viewModel

    private val viewBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewModel.exampleCallCoroutines()
    }
}