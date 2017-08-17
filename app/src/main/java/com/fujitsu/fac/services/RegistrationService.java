package com.fujitsu.fac.services;

import android.content.Context;
import android.content.SharedPreferences;

import com.fujitsu.fac.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by b.balote on 8/3/2017.
 */

public class RegistrationService {

    private static final String IS_REGISTERED_KEY = "isRegistered";

    public RegistrationService() {
    }

    public void persistRegistrationFlag(Context c, boolean isRegistered) {

        String sharedPrefName = c.getResources().getString(R.string.SHARED_PREF_NAME);
        SharedPreferences.Editor editor = c.getSharedPreferences(sharedPrefName, MODE_PRIVATE).edit();
        editor.putBoolean(IS_REGISTERED_KEY, isRegistered);
        editor.apply();
    }

    public boolean retrieveRegistrationFlag(Context c) {

        String sharedPrefName = c.getResources().getString(R.string.SHARED_PREF_NAME);
        SharedPreferences prefs = c.getSharedPreferences(sharedPrefName, MODE_PRIVATE);
        Boolean isRegistered = prefs.getBoolean(IS_REGISTERED_KEY, false);
        if(isRegistered != null) {
            return isRegistered.booleanValue();
        }
        return false;
    }
}
