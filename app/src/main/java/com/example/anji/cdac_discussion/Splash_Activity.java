package com.example.anji.cdac_discussion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        ImageView imageView = (ImageView) findViewById(R.id.splash_img);
        imageView.setAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(getApplicationContext(),Home_Activity.class));
                finish();
            }
        },6000);
    }
    }

