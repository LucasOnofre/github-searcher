package com.br.githubsearcher.utils

import android.app.Application
import com.google.gson.GsonBuilder
import com.onoffrice.githubsearcher.di.anotherModules
import com.onoffrice.githubsearcher.di.dataModules
import com.onoffrice.githubsearcher.di.domainModules
import com.onoffrice.githubsearcher.di.networkModules
import com.onoffrice.githubsearcher.di.presentationModules
import okhttp3.OkHttpClient
import org.koin.core.context.startKoin
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "http://127.0.0.1:8080"

class TestApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(presentationModules)
            modules(domainModules)
            modules(dataModules)
            modules(anotherModules)
            modules(networkModules)
            modules(networkAndroidTestModule)
        }
    }

    private val networkAndroidTestModule = module(override = true) {
        single { OkHttpClient.Builder().build() }

        single {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(get())
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
        }
    }
}