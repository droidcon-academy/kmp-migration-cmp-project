package com.droidcon.simplejokes.di

import androidx.room.Room
import androidx.room.RoomDatabase
import com.droidcon.simplejokes.jokes.data.database.JokesDatabase
import org.koin.core.module.Module

actual fun Module.bindPlatformDatabaseModule() {

    single<RoomDatabase.Builder<JokesDatabase>> {
        Room.databaseBuilder<JokesDatabase>(
            context = get(),
            name = JokesDatabase.DB_NAME
        )
    }
}