package com.example.technote.TN_Network.NetworkAPI_Library.RetrofitExamples;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=cruise&key=AIzaSyBrJ3ec9wTuS6L-xHkaXLU8BJbFsx_LZ9o")
    Call<JsonObject> getMyJsonObject();
}