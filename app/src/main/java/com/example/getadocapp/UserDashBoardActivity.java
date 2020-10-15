package com.example.getadocapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class UserDashBoardActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
ImageView searchView;
EditText editSearch;
Vibrator v;
private ViewPager viewPager;
private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dash_board);

        drawerLayout = findViewById(R.id.drawerLayout);
        searchView = findViewById(R.id.searchImage);
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);                      // Setting the adapter onto the view pager
        tabLayout.setupWithViewPager(viewPager);            // Giving the TabLayout the ViewPager

        setTabIcons();
    }

    private void setTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_explore);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_mail);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_notification);

    }

    public void openSettings(View view){
        Toast.makeText(this, "To be implemented", Toast.LENGTH_LONG).show();
    }


  /**  public void searchData(View view) {
        String s_search;
        s_search = editSearch.getText().toString().trim();

        if (s_search.equalsIgnoreCase("")){
            v.vibrate(100);
            editSearch.requestFocus();
            editSearch.setError("No data to search");

        }else{

            Toast.makeText(this, "searching", Toast.LENGTH_SHORT).show();

        }
    }       **/

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

    public void allPosts(MenuItem item) {
        startActivity(new Intent(UserDashBoardActivity.this,UserPostsActivity.class));
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

    public void viewProfile(View view) {
       AlertDialog.Builder builder = new AlertDialog.Builder(this);
       builder.setTitle("Information");
       builder.setMessage("Go to user profile?");
       builder.setNegativeButton("No",null);
       builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
            Intent u = new Intent(UserDashBoardActivity.this, UserProfileActivity.class);
            startActivity(u);
            finish();
           }
       }); builder.create();
       builder.show();
    }

    public void NewPost(View view) {
        Toast.makeText(this, "New Post Activity Call", Toast.LENGTH_SHORT).show();
    }

    public void searchPage(View view) {
        Toast.makeText(this, "Page Activity", Toast.LENGTH_SHORT).show();
    }
}