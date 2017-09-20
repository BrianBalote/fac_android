package com.fujitsu.fac.activities.social;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.fujitsu.fac.R;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class SocialActivity extends RoboActivity {

    private static final String MY_URL = "https://touch.facebook.com/fujitsuPH/";

    @InjectView(R.id.back_button)
    private View backBtn;

    @InjectView(R.id.my_web_view)
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        myWebView.setWebViewClient(new MyBrowser());
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        myWebView.loadUrl(MY_URL);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            if (url.startsWith(MY_URL)) {
                view.loadUrl(url);
            }
            return true;
        }
    }

}