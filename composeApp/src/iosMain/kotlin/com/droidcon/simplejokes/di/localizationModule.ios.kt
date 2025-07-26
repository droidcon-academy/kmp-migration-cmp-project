package com.droidcon.simplejokes.di

import com.droidcon.simplejokes.core.presentation.Localization
import org.koin.dsl.module

actual val localizationModule = module {
    single<Localization> {
        Localization()
    }
}