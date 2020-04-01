package com.example.webview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = (EditText) findViewById(R.id.url);
    }

    public void navegate(View view){
        Intent i = new Intent(this, activityWeb.class);
        i.putExtra("site", url.getText().toString());
        startActivity(i);
    }
}
