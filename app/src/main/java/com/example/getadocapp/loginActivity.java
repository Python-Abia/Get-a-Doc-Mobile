package com.example.getadocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class loginActivity extends AppCompatActivity {
EditText login,password;
Vibrator v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login = findViewById(R.id.loginID);
        password = findViewById(R.id.loginPassword);
        v =(Vibrator) getSystemService(VIBRATOR_SERVICE);


    }

    public void forgotPassword(View view) {
        Toast.makeText(this, "forgot password", Toast.LENGTH_SHORT).show();
    }

    public void authenticate(View view) {
        String s_login, s_password, s_spinner;
        s_login = login.getText().toString().trim();
        s_password= password.getText().toString().trim();

        if (!Patterns.EMAIL_ADDRESS.matcher(s_login).matches()||(s_login.isEmpty())){
            v.vibrate(100);
            login.requestFocus();
            login.setError("Field is mandatory");
          return;
        } if (TextUtils.isEmpty(s_password)){
            v.vibrate(100);
            password.requestFocus();
            password.setError("Password is required");

        }else {

            startActivity(new Intent(loginActivity.this, UserDashBoardActivity.class));
        }
    }


    public void newUserAccount(View view) {
     startActivity(new Intent(loginActivity.this,UserDashBoardActivity.class));
    }
}