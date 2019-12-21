package com.example.devicetracker.serverCalls;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {
    private static final String BASE_URL = "https://brank.ba/sound_lavel_master/";
   // private static final String BASE_URL = "http://198.199.80.106";
   private static Retrofit retrofit;
    public static Retrofit getRetrofitClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        //If condition to ensure we don't create multiple retrofit instances in a single application
        if (retrofit == null) {
            //Defining the Retrofit using Builder
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) //This is the only mandatory call on Builder object.
                    .addConverterFactory(GsonConverterFactory.create(gson)) // Convertor library used to convert response into POJO
                    .build();
        }
        return retrofit;
    }

}