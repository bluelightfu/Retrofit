package com.example.retrofit.Repository

import com.example.retrofit.Api.RetrofitInstance
import com.example.retrofit.Model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<Post> = RetrofitInstance.api.getPost()
}