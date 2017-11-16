package com.company.ox.petshop;

import android.app.Application;
import android.content.Context;

/**
 * Created by matheus_araujo on 15/11/17.
 */

public class MyApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        super.onCreate();
    }

    public static Context getContext() {
        return mContext;
    }

}
