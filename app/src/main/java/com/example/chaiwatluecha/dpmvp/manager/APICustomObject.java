package com.example.chaiwatluecha.dpmvp.manager;

import android.content.Context;

import com.example.chaiwatluecha.dpmvp.manager.api.ResponseListener;

public class APICustomObject {

    private ResponseListener responseListener;
    private Context context;
    private boolean defaultShowApiError;

    public ResponseListener getResponseListener() {
        return responseListener;
    }

    public void setResponseListener(ResponseListener responseListener) {
        this.responseListener = responseListener;
    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public boolean isDefaultShowApiError() {
        return defaultShowApiError;
    }

    public void setDefaultShowApiError(boolean defaultShowApiError) {
        this.defaultShowApiError = defaultShowApiError;
    }


}
