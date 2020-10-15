package com.example.getadocapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void authenticate(View view) {
        startActivity(new Intent(this,loginActivity.class));
        finish();
    }

    public void newUserAccount(View view) {
        startActivity(new Intent(this,RegistrationActivity.class));
        finish();
    }
}