package com.example.kotlinretrofitsamplegetreq.api

import com.example.kotlinretrofitsamplegetreq.model.Post1
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi2
{
    @GET("everything?q=besiktas&page=1&apiKey=a1c7f2ec8dee43499440ef0297012fba")
    suspend fun getPost1(): Response<Post1>
}