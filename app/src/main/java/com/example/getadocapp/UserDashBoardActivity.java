package com.example.getadocapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class UserDashBoardActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
ImageView searchView;
EditText editSearch;
Vibrator v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dash_board);

        drawerLayout = findViewById(R.id.drawerLayout);
        searchView = findViewById(R.id.searchImage);
        editSearch = findViewById(R.id.et_search);
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


    }

    public void searchData(View view) {
        String s_search;
        s_search = editSearch.getText().toString().trim();

        if (s_search.equalsIgnoreCase("")){
            v.vibrate(100);
            editSearch.requestFocus();
            editSearch.setError("No data to search");

        }else{

            Toast.makeText(this, "searching", Toast.LENGTH_SHORT).show();

        }
    }

    public void drawersDisplay(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawers();
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    public void checkMessages(MenuItem item) {
        Toast.makeText(this, "Volley Messages", Toast.LENGTH_SHORT).show();
    }

    public void allContacts(MenuItem item) {
        Toast.makeText(this, "Volley Contacts", Toast.LENGTH_SHORT).show();
    }

    public void logoutUser(MenuItem item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logging out Information");
        builder.setMessage("Do you wants to Logout?");
        builder.setNegativeButton("No",null);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(UserDashBoardActivity.this, loginActivity.class));
            }
        });builder.create();
        builder.show();
    }

    public void findHelp(MenuItem item) {
        Toast.makeText(this, "Help dialog to show", Toast.LENGTH_SHORT).show();
    }
}