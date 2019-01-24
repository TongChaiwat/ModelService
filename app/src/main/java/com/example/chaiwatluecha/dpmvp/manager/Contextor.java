package com.example.chaiwatluecha.dpmvp.manager;

import android.content.Context;

public class Contextor {

    private static Contextor instance;
    private Context mContext;

    public static Contextor getInstance(){
        if(instance==null) {
            instance = new Contextor();
        }
        return instance;
    }

    public void setContext(Context context){
        this.mContext = context;

    }
    public Context getContext(){
        return this.mContext;
    }

}
