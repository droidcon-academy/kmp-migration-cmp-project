package com.droidcon.simplejokes.di

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.droidcon.simplejokes.jokes.data.database.JokesDao
import com.droidcon.simplejokes.jokes.data.database.JokesDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.module.Module
import org.koin.dsl.module

expect fun Module.bindPlatformDatabaseModule()

val databaseModule = module {
    bindPlatformDatabaseModule()

    single<JokesDatabase> {
        get<RoomDatabase.Builder<JokesDatabase>>()
            .setDriver(BundledSQLiteDriver())
            .setQueryCoroutineContext(Dispatchers.IO)
            .build()
    }

    single<JokesDao> {
        get<JokesDatabase>().jokesDao
    }
}