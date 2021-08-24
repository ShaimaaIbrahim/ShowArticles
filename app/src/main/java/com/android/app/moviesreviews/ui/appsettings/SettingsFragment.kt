package com.android.app.moviesreviews.ui.appsettings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat
import com.android.app.moviesreviews.R
import com.android.app.moviesreviews.databinding.FragmentSettingsBinding
import com.android.app.moviesreviews.utils.constants.PREF_MODE_KEY


class SettingsFragment : PreferenceFragmentCompat() {


    override fun onPreferenceTreeClick(preference: Preference?): Boolean {
        if (preference!!.key == PREF_MODE_KEY) {
            if ((preference as SwitchPreferenceCompat).isChecked)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            else
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        return super.onPreferenceTreeClick(preference)
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.app_preference, rootKey)
    }

}