package com.example.getadocapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UserPostsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_posts);
    }

    public void moveBack(View view) { startActivity(new Intent(UserPostsActivity.this,UserDashBoardActivity.class));
    }
}
