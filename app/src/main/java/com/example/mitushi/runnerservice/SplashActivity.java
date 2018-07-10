package com.example.mitushi.runnerservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;


public class SplashActivity extends Activity {

    private final int SPLASH_DURATION = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent theIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(theIntent);
                finish();
            }
        }, SPLASH_DURATION);
    }
}
