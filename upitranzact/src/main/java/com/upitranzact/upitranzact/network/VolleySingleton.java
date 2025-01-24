package com.upitranzact.upitranzact.network;

import android.content.Context;

public class VolleySingleton {
    private static VolleySingleton instance;
    private final com.android.volley.RequestQueue requestQueue;

    private VolleySingleton(Context context) {
        requestQueue = com.android.volley.toolbox.Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingleton getInstance(Context context) {
        if (instance == null) {
            instance = new VolleySingleton(context);
        }
        return instance;
    }

    public com.android.volley.RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public <T> void addToRequestQueue(com.android.volley.Request<T> request) {
        getRequestQueue().add(request);
    }
}

