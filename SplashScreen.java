package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {
LinearLayout lout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        lout = findViewById(R.id.task);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent launch = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(launch);
            }
        },5000);
        Animation scale = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.scale);
        lout.startAnimation(scale);
    }
}