package com.droidcon.simplejokes.core.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

actual class Vault {
    actual val dataStore: DataStore<Preferences>
        get() = TODO("Not yet implemented")
}