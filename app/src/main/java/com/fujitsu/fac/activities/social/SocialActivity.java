package com.fujitsu.fac.activities.social;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.fujitsu.fac.R;

public class SocialActivity extends Activity {

    private static final String MY_URL = "https://touch.facebook.com/fujitsuPH/";

    private View backBtn;
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        myWebView = (WebView) findViewById(R.id.my_web_view);
        myWebView.setWebViewClient(new MyBrowser());
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        myWebView.loadUrl(MY_URL);

        backBtn = (View) findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
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