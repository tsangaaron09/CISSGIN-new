package com.example.fatboy.cissgin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Fatboy on 6/1/2018.
 */

public class vigilpage2 extends AppCompatActivity{

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vigilpage2);
        getSupportActionBar().hide();

        webView = (WebView)(findViewById(R.id.vigil2));
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.cissmun.org/vig2");


    }

}
