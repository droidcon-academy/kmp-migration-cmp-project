package com.droidcon.simplejokes.core.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

expect class Vault {
    val dataStore: DataStore<Preferences>
}