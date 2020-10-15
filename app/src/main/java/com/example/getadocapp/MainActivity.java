package com.example.getadocapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    MotionLayout motionLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        motionLayout = findViewById(R.id.motion);
        motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

            }

            @Override

            public void onFinish() {
            startActivity(new Intent(MainActivity.this,LandingActivity.class));
            finish();

            public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                startActivity(new Intent(MainActivity.this,loginActivity.class));
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {


            }
        });
//        CountDownTimer countDownTimer = new CountDownTimer(3000,1000) {
//            @Override
//            public void onTick(long l) {
//
//            }
//
//            @Override
//            public void onFinish() {
//            startActivity(new Intent(MainActivity.this,loginActivity.class));
//            }
//        }; countDownTimer.start();
    }
}