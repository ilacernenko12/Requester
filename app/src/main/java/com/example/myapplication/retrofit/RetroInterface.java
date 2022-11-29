package com.example.myapplication.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroInterface {
    @GET ("get_number")
    Call<String> getData(@Query("email") String email);

    @GET ("get_email")
    Call<String> getEmail(@Query("number") String number);
}
