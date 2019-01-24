package com.example.chaiwatluecha.dpmvp;

import android.app.Application;

import com.example.chaiwatluecha.dpmvp.manager.Contextor;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().setContext(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
