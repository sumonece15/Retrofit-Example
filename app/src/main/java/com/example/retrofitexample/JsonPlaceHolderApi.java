package com.example.retrofitexample;

import android.text.GetChars;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("Posts")
    Call<List<Post>> getPost();

    @GET("Comment")
    Call<List<Comment>> getComment();
}
