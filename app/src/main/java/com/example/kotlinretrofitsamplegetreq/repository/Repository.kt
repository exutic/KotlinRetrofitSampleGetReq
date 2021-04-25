package com.example.kotlinretrofitsamplegetreq.repository

import com.example.kotlinretrofitsamplegetreq.api.RetrofitInstance
import com.example.kotlinretrofitsamplegetreq.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost():Response<Post>
    {
        return RetrofitInstance.api.getPost()
    }

}