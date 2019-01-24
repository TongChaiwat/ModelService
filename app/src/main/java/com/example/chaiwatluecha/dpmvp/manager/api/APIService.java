package com.example.chaiwatluecha.dpmvp.manager.api;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface APIService {


    @POST(APIConstants.APP_SETTING_API)
    Call<JsonElement> getBannerList(@Query("member_id")int member_id, @Query("name")String name);



}
