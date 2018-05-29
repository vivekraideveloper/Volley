package com.vijayjaidewan01vivekrai.volley_github;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by MR VIVEK RAI on 29-05-2018.
 */

public class VolleySingleton {

    private static VolleySingleton mInstance;
    private RequestQueue mRequestQueue;

    private VolleySingleton(Context context) {
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingleton getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new VolleySingleton(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        return mRequestQueue;
    }
}
