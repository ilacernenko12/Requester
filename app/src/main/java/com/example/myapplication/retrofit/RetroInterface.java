package com.example.myapplication.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetroInterface {
    @GET ("get_number")
    Call<String> getData(@Query("email") String email);

    @GET ("get_email")
    Call<String> getEmail(@Query("number") String number);

    @POST ("set_android_data")
    Call<InputData> setInputData (@Body InputData inputData);

    Call<InputData> setInputData(String name, String email, String phone);
}
