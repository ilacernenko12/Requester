package com.example.myapplication.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {

    /* private final static String URL = "http://172.16.230.69:4534/";*/
    private final static String URL = "http://10.0.2.2:4534/";

    private static final Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public static RetroInterface getInstance() {
        return new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(RetroInterface.class);
    }
}
