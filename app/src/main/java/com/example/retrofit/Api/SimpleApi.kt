package com.example.retrofit.Api

import com.example.retrofit.Model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost():Response<Post>
}