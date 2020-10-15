package com.example.getadocapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //constructor for the class
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //Determining the fragment for each tab

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new HomeFragmentClass();
        }else if (position ==1){
            return new MessageFragmentClass();
        }else{
        return new NotificationFragmentClass();
    }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 3;
    }

    //Setting the Viewpager titles
    /**
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.explore);
            case 1:
                return mContext.getString(R.string.mail);
            case 2:
                return mContext.getString(R.string.notifications);
            default:
                return null;
        }

    }   **/
}
