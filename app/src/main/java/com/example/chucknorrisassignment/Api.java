package com.example.chucknorrisassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api.chucknorris.io/";
    @GET("jokes/random")
    Call<JokesModel> getstatus();

}
