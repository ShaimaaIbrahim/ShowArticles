package com.android.app.moviesreviews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate.*
import androidx.preference.PreferenceManager
import com.android.app.moviesreviews.R
import com.android.app.moviesreviews.utils.constants.PREF_MODE_KEY
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PreferenceManager.setDefaultValues(this, R.xml.app_preference, false)
        defaultMode()

    }

    private fun defaultMode() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        val isNightMode = sharedPreferences.getBoolean(PREF_MODE_KEY, false)
        setDefaultNightMode(if (isNightMode) MODE_NIGHT_YES else MODE_NIGHT_NO)
    }
}