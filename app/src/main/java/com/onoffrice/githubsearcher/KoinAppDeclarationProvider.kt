package com.onoffrice.githubsearcher

import android.app.Application
import android.util.Log
import com.holder.data.remote.di.DataRemoteModule
import com.onoffrice.githubsearcher.di.AppModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.KoinApplication
import org.koin.core.logger.EmptyLogger
import org.koin.core.logger.Level
import org.koin.core.logger.Logger
import org.koin.core.logger.MESSAGE
import org.koin.dsl.KoinAppDeclaration

object KoinAppDeclarationProvider {

    @Suppress("LongMethod")
    fun get(application: Application): KoinAppDeclaration = {
        setupKoinLogger()

        androidContext(application)

        DataRemoteModule.load()
        AppModules.load()

    }

    private fun KoinApplication.setupKoinLogger() {
        if (BuildConfig.DEBUG) {
            logger(object : Logger(Level.DEBUG) {
                override fun log(level: Level, msg: MESSAGE) {
                    when (level) {
                        Level.DEBUG -> Log.d(KOIN_LOGGER_TAG, msg)
                        Level.INFO -> Log.i(KOIN_LOGGER_TAG, msg)
                        Level.ERROR -> Log.e(KOIN_LOGGER_TAG, msg)
                    }
                }
            })
        } else {
            logger(EmptyLogger())
        }
    }
}

private const val KOIN_LOGGER_TAG = "KOIN_LOGGER"
