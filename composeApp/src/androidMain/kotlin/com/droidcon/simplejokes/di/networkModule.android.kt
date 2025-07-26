package com.droidcon.simplejokes.di

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.core.module.Module

actual fun Module.bindPlatformNetworkModule() {
    single<HttpClientEngine> {
        OkHttp.create()
    }
}