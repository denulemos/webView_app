package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activityWeb extends AppCompatActivity {

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wb = (WebView) findViewById(R.id.wb);

        String url = getIntent().getStringExtra("site");
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("http://" + url);
    }
}
