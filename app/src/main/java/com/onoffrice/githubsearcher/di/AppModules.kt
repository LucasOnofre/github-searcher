package com.onoffrice.githubsearcher.di

import com.holder.data.remote.client.HttpClient
import com.onoffrice.githubsearcher.data.api.GithubService
import com.onoffrice.githubsearcher.data.datasource.GithubRemoteDataSource
import com.onoffrice.githubsearcher.data.datasource.GithubRemoteDataSourceImpl
import com.onoffrice.githubsearcher.data.repository.GithubRepositoryImpl
import com.onoffrice.githubsearcher.domain.repository.GithubRepository
import com.onoffrice.githubsearcher.domain.usecase.GetUsersUseCase
import com.onoffrice.githubsearcher.presentation.home.SearchUsersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

object AppModules {
    private val domainModules = module {
        factory { GetUsersUseCase(repository = get()) }
    }

    private val presentationModules = module {
        viewModel { SearchUsersViewModel(useCase = get()) }
    }

    private val dataModules = module {
        factory<GithubRemoteDataSource> { GithubRemoteDataSourceImpl(api = get()) }
        factory<GithubRepository> { GithubRepositoryImpl(remoteDataSource = get()) }
    }

    private val networkModules = module {
        factory { get<HttpClient>().create(GithubService::class.java) }
    }

    fun load() = loadKoinModules(
        listOf(
            domainModules,
            presentationModules,
            dataModules,
            networkModules
        )
    )
}
