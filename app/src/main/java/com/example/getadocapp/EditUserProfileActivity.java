package com.example.getadocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EditUserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_profile);
    }

    public void moveBack(View view) {
        startActivity(new Intent(this, UserProfileActivity.class));
    }

    public void saveEditing(View view) {
        Toast.makeText(this, "Saves Editing", Toast.LENGTH_SHORT).show();
    }
}