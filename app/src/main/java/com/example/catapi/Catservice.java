package com.example.catapi;

import java.util.List;

import retrofit2.Call;
import  retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Catservice {
    String BASE_URL = "https://api.thecatapi.com";

    @GET("/v1/images/{search}")
    Call<List<Cat>> getRandomImage(@Path("search")String search);




}
