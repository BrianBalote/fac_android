package com.fujitsu.fac.activities.about;

import android.os.Bundle;
import android.view.View;

import com.fujitsu.fac.R;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class AboutActivity extends RoboActivity {

    @InjectView(R.id.back_button)
    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
