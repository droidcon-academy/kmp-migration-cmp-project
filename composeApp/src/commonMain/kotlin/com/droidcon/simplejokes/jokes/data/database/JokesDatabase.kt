package com.droidcon.simplejokes.jokes.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import com.droidcon.simplejokes.jokes.data.model.JokeEntity

@ConstructedBy(AppDatabaseConstructor::class)
@Database(entities = [JokeEntity::class], version = 1, exportSchema = false)
abstract class JokesDatabase : RoomDatabase() {
    abstract val jokesDao: JokesDao

    companion object {
        const val DB_NAME = "jokes.db"
    }
}

// The Room compiler generates the `actual` implementations.
@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object AppDatabaseConstructor : RoomDatabaseConstructor<JokesDatabase> {
    override fun initialize(): JokesDatabase
}
