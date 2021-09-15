package com.onoffrice.githubsearcher.di

import com.onoffrice.githubsearcher.data.retrofit.HttpClient
import com.onoffrice.githubsearcher.data.retrofit.RetrofitClient
import com.onoffrice.githubsearcher.data.api.GithubService
import com.onoffrice.githubsearcher.data.datasource.RemoteDataSource
import com.onoffrice.githubsearcher.data.datasource.RemoteDataSourceImpl
import com.onoffrice.githubsearcher.data.repository.YourRepositoryImpl
import com.onoffrice.githubsearcher.domain.repository.YourRepository
import com.onoffrice.githubsearcher.domain.usecase.GetExampleUseCase
import com.onoffrice.githubsearcher.presentation.YourViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val domainModules = module {
    factory { GetExampleUseCase(repository = get()) }
}

val presentationModules = module {
    viewModel { YourViewModel(useCase = get()) }
}

val dataModules = module {
    factory<RemoteDataSource> { RemoteDataSourceImpl(api = get()) }
    factory<YourRepository> { YourRepositoryImpl(remoteDataSource = get()) }
}

val networkModules = module {
    single { RetrofitClient(application = androidContext()).newInstance() }
    single { HttpClient(get()) }
    factory { get<HttpClient>().create(GithubService::class.java) }
}

val anotherModules = module {}
