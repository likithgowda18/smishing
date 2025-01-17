package com.example.smishingdetectionapp.DataBase;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Retrofitinterface {

    @POST("/login")
    Call<DBresult> executeLogin(@Body HashMap<String, String> map);

    @POST("/signup")
    Call<SignupResponse> executeSignup(@Body HashMap<String, String> map);

    @POST("/verify")
    Call<VerificationResponse> executeVerify(@Body HashMap<String, String> map); // New method for verification
}
