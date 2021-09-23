package com.onoffrice.githubsearcher.application

import android.app.Application
import org.koin.core.context.startKoin

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(appDeclaration = KoinAppDeclarationProvider.get(this))
    }
}