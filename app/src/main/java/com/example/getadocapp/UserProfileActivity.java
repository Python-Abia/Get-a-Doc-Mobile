package com.example.getadocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }

    public void moveBack(View view) { startActivity(new Intent(UserProfileActivity.this,UserDashBoardActivity.class));
    }

    public void editUser(View view) {
        startActivity(new Intent(UserProfileActivity.this,EditUserProfileActivity.class));
    }
}