package com.droidcon.simplejokes.core.presentation

import platform.Foundation.NSUserDefaults

actual class Localization {
    actual fun updateLocale(languageTag: String) {
        NSUserDefaults.standardUserDefaults.setObject(
            listOf(languageTag),
            forKey = "AppleLanguages"
        )
        NSUserDefaults.standardUserDefaults.synchronize()
    }
}