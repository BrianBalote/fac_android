package com.fujitsu.fac.activities.sponsors;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.fujitsu.fac.R;

public class SponsorsActivity extends Activity {

    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        backBtn = (View) findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
