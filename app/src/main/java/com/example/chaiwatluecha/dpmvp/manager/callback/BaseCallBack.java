package com.example.chaiwatluecha.dpmvp.manager.callback;



import com.example.chaiwatluecha.dpmvp.manager.APICustomObject;

import retrofit2.Callback;

public abstract class BaseCallBack implements Callback {

    public String TAG = getClass().getSimpleName();
    public APICustomObject apiCustomObject = null;

    public void setAPICustomObject(APICustomObject apiCustomObject){
        this.apiCustomObject = apiCustomObject;
    }
}
