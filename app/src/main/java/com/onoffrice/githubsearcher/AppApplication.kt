package com.onoffrice.githubsearcher

import android.app.Application
import com.onoffrice.githubsearcher.KoinAppDeclarationProvider
import org.koin.core.context.startKoin

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(appDeclaration = KoinAppDeclarationProvider.get(this))
    }
}