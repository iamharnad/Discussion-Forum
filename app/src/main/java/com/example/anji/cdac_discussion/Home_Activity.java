package com.example.anji.cdac_discussion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Home_Activity extends AppCompatActivity {
    Animation fade_in,fade_out;
    ViewFlipper viewFlipper;
    Button aboutcdac,discussion,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);
        viewFlipper = (ViewFlipper)findViewById(R.id.images);
        AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        AnimationUtils.loadAnimation(this,android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setInAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1000);
        viewFlipper.startFlipping();

        aboutcdac = (Button)findViewById(R.id.btn_aboutcdac);
        aboutcdac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),About_Cdac_Activity.class);
                startActivity(in);
            }
        });

        discussion = (Button)findViewById(R.id.btn_discussion);
        discussion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
        exit = (Button)findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
