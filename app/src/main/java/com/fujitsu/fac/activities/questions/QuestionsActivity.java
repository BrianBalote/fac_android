package com.fujitsu.fac.activities.questions;

import android.os.Bundle;
import android.view.View;

import com.fujitsu.fac.R;

import roboguice.activity.RoboListActivity;
import roboguice.inject.InjectView;

public class QuestionsActivity extends RoboListActivity {

    @InjectView(R.id.back_button)
    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
