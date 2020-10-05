package com.example.getadocapp;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    private static VolleySingleton mInstance;
    private static Context mContext;
    private RequestQueue mRequestQueue;

    private VolleySingleton(Context context) {
        mContext = context;
        mRequestQueue = getRequestQueue();
    }
        // Returns object of the class
    public static synchronized VolleySingleton getInstance(Context context){
        if (mInstance == null){
            mInstance = new VolleySingleton(context);
        }return mInstance;
    }

    //Returns the requestQueue on volley
    public  RequestQueue getRequestQueue(){
        if (mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }return mRequestQueue;
    }

    //Adding each of the request to the requestQueue
    public <T> void addToRequestQueue(Request<T> requestQueue){
        getRequestQueue().add(requestQueue);
    }
}
