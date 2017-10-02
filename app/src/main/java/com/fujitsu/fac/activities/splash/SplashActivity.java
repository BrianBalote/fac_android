package com.fujitsu.fac.activities.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.fujitsu.fac.R;
import com.fujitsu.fac.activities.dashboard.DashboardActivity;
import com.fujitsu.fac.activities.registration.RegistrationActivity;
import com.fujitsu.fac.services.EmailPersistenceService;

public class SplashActivity extends Activity {

    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHandler = new Handler();
        mHandler.postDelayed(mUpdateTimeTask, 3000);
    }

    private boolean checkIfRegistered() {
        if(EmailPersistenceService.getEmail(SplashActivity.this).equalsIgnoreCase("")) {
            return false;
        }
        return true;
    }

    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {

            if (checkIfRegistered()) {
                Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(SplashActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }

            finish();
        }
    };
}
