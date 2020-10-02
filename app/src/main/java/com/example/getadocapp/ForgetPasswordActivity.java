package com.example.getadocapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Provider;

public class ForgetPasswordActivity extends AppCompatActivity {
EditText et_email;
Vibrator v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        et_email = findViewById(R.id.et_email_recovery);
        v =(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void cancelRecovery(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Information");
        builder.setMessage("Do you wish to cancel?");
        builder.setNegativeButton("No",null);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(ForgetPasswordActivity.this,loginActivity.class));
            }
        }); builder.create();
        builder.show();

    }

    public void recoveringPassword(View view) {
        String email;
        email = et_email.getText().toString().trim();

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()||(TextUtils.isEmpty(email))){
            v.vibrate(100);
            et_email.setError("Email address is required!");
            et_email.requestFocus();
        }else{

            Toast.makeText(this, "password sent to your email", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(ForgetPasswordActivity.this,loginActivity.class));
        }

    }
}