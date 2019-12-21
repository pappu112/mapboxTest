package com.example.devicetracker.serverCalls;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static Retrofit retrofit;
    //private static final String BASE_URL = "http://198.199.80.106/";
    private static final String BASE_URL = "https://dev.keeno.app/api/v1/";


    public static Retrofit getRetrofitInstance() {


        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
