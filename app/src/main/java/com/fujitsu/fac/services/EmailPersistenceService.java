package com.fujitsu.fac.services;

import android.content.Context;
import android.content.SharedPreferences;

import com.fujitsu.fac.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by balote on 01/10/2017.
 */

public class EmailPersistenceService {

    private static final String EMAIL_KEY = "EMAIL_KEY";

    public static void saveEmail(Context c, String email) {

        String sharedPrefName = c.getResources().getString(R.string.SHARED_PREF_NAME);
        SharedPreferences.Editor editor = c.getSharedPreferences(sharedPrefName, MODE_PRIVATE).edit();
        editor.putString(EMAIL_KEY, email);
        editor.apply();
    }

    public static String getEmail(Context c) {

        String sharedPrefName = c.getResources().getString(R.string.SHARED_PREF_NAME);
        SharedPreferences prefs = c.getSharedPreferences(sharedPrefName, MODE_PRIVATE);
        String email = prefs.getString(EMAIL_KEY, "");
        if(email != null) {
            return email;
        }
        return "";
    }
}
