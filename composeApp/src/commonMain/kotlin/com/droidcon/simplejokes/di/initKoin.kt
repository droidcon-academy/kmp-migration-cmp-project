package com.droidcon.simplejokes.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            databaseModule,
            jokesRepositoryModule,
            localizationModule,
            networkModule,
            preferencesModule,
            snackbarModule,
            vaultModule,
            viewModelsModule,
            platformModule // This contains platform-specific dependencies
        )
    }
}