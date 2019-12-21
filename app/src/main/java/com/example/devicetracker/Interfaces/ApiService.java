package com.example.devicetracker.Interfaces;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @FormUrlEncoded
    @POST("add_data.php")
    Call<String> addData(@Field("device_id") String device_id,
                         @Field("noice_value") String value,
                         @Field("location") String location,
                         @Field("lat") String lat,
                         @Field("lng") String lng);

    @FormUrlEncoded
    @POST("add-trackerdata.php")
    Call<String> addData(@Field("device_id") String device_id,
                         @Field("lat") String lat,
                         @Field("lng") String lng);
}
