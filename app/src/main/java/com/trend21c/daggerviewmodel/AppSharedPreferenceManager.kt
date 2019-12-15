package com.trend21c.daggerviewmodel

import android.content.Context
import android.preference.PreferenceManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppSharedPreferenceManager @Inject constructor(
    val context: Context
) {
    private val prefs by lazy {
        PreferenceManager.getDefaultSharedPreferences(context)
    }
}