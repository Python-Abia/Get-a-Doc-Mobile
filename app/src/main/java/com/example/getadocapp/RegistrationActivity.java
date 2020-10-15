package com.example.getadocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RegistrationActivity extends AppCompatActivity {
Spinner regSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regSpinner = findViewById(R.id.spinner);


        List<String>list = new ArrayList<>();
        list.add("Select Account type");
        list.add("Medical practitioner");
        list.add("Non practitioner");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        regSpinner.setAdapter(arrayAdapter);
        regSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String value;
                        value = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(RegistrationActivity.this, value, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void cancelDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Information");
        builder.setMessage("Do you want to cancel Sign Up?");
        builder.setNegativeButton("No",null);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(RegistrationActivity.this,LandingActivity.class));
            }
        });
        builder.create();
        builder.show();
    }
}