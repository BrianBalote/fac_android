package com.fujitsu.fac.activities.social;

import android.os.Bundle;
import android.view.View;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.fujitsu.fac.R;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class SocialActivity extends RoboActivity {

    @InjectView(R.id.back_button)
    private View backBtn;

    @InjectView(R.id.login_button)
    private LoginButton fbLoginBtn;

    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        this.callbackManager = CallbackManager.Factory.create();

        this.fbLoginBtn.setReadPermissions("email");
        this.fbLoginBtn.registerCallback(this.callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                System.out.print("+++ fb login success");
            }

            @Override
            public void onCancel() {
                System.out.print("+++ fb login canceled");
            }

            @Override
            public void onError(FacebookException exception) {
                System.out.print("+++ fb login error");
            }
        });

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}