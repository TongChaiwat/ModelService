package com.example.chaiwatluecha.dpmvp.manager.callback;

import com.example.chaiwatluecha.dpmvp.item.NewRegisterCheckResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Response;

public class UserDataCallBack extends BaseCallBack {

    @Override
    public void onResponse(Call call, Response response) {
        try {
            NewRegisterCheckResponse newRegisterCheckResponse = new Gson().fromJson(response.body().toString(), NewRegisterCheckResponse.class);
            if (apiCustomObject != null) {
                apiCustomObject.getResponseListener().response(newRegisterCheckResponse, newRegisterCheckResponse.getReturnCode());
            }
        } catch (Exception e) {
            apiCustomObject.getResponseListener().showMsg(e.toString());
        }
    }

    @Override
    public void onFailure(Call call, Throwable t) {
        apiCustomObject.getResponseListener().showMsg(t.toString());
    }




}
