package com.example.chaiwatluecha.dpmvp.manager;


import com.example.chaiwatluecha.dpmvp.manager.api.API;
import com.example.chaiwatluecha.dpmvp.manager.api.APIService;
import com.example.chaiwatluecha.dpmvp.manager.api.ResponseListener;
import com.example.chaiwatluecha.dpmvp.manager.callback.UserDataCallBack;
import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class WebServiceModel {

    private APIService mAPIService1;
    private static WebServiceModel webServiceModel;

    public static WebServiceModel getInstance(){
        if(webServiceModel==null){
            webServiceModel = new WebServiceModel(5);
        }
        return webServiceModel;
    }


    public WebServiceModel(int context){
        Retrofit.Builder builder =
                new Retrofit.Builder()
                        .baseUrl(API.BASE_URL_DOMAIN)
                        .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        mAPIService1 = retrofit.create(APIService.class);
    }


     public void requestHomeBannerList(int member_id, String name, ResponseListener responseListener) {

         APICustomObject apiCustomObject = new APICustomObject();
         apiCustomObject.setResponseListener(responseListener);
         apiCustomObject.setContext(Contextor.getInstance().getContext());
         apiCustomObject.setDefaultShowApiError(false);

        Call<JsonElement> call = mAPIService1.getBannerList(member_id,name);
        UserDataCallBack userDataCallBack = new UserDataCallBack();
        userDataCallBack.setAPICustomObject(apiCustomObject);

        call.enqueue(userDataCallBack);


    }




}
