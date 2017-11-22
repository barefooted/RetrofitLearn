package com.codegene.femicodes.retrofitlearn;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by femicodes on 11/21/2017.
 */

public interface PostApi {

    String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("posts")
    Call<List<Post>> getPosts();

}
