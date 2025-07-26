package com.droidcon.simplejokes

import androidx.compose.ui.window.ComposeUIViewController
import com.droidcon.simplejokes.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}