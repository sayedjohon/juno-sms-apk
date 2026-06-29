package me.capcom.smsgateway.ui.settings

import android.os.Bundle
import me.capcom.smsgateway.R

class DeveloperInfoFragment : BasePreferenceFragment() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.developer_preferences, rootKey)
    }

    companion object {
        fun newInstance() = DeveloperInfoFragment()
    }
}
