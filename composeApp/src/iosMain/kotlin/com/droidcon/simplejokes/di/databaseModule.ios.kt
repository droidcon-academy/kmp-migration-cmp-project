package com.droidcon.simplejokes.di

import androidx.room.Room
import androidx.room.RoomDatabase
import com.droidcon.simplejokes.jokes.data.database.JokesDatabase
import kotlinx.cinterop.ExperimentalForeignApi
import org.koin.core.module.Module
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask

actual fun Module.bindPlatformDatabaseModule() {

    single<RoomDatabase.Builder<JokesDatabase>> {
        val dbFilePath = documentDirectory() + JokesDatabase.DB_NAME
        Room.databaseBuilder<JokesDatabase>(
            name = dbFilePath,
        )
    }
}

@OptIn(ExperimentalForeignApi::class)
private fun documentDirectory(): String {
    val documentDirectory = NSFileManager.defaultManager.URLForDirectory(
        directory = NSDocumentDirectory,
        inDomain = NSUserDomainMask,
        appropriateForURL = null,
        create = false,
        error = null,
    )
    return requireNotNull(documentDirectory?.path)
}