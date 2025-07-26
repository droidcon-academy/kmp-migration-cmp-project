package com.droidcon.simplejokes.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import platform.UIKit.UIApplication
import platform.UIKit.UIStatusBarStyleDarkContent
import platform.UIKit.UIStatusBarStyleLightContent
import platform.UIKit.setStatusBarStyle

@Composable
actual fun SetSystemBarAppearance(darkTheme: Boolean) {

    LaunchedEffect(darkTheme) { // Re-run if theme changes
        UIApplication.sharedApplication.setStatusBarStyle(
            if (darkTheme)
                UIStatusBarStyleLightContent
            else
                UIStatusBarStyleDarkContent
        )
    }
}