package com.example.kotlinretrofitsamplegetreq.repository

import com.example.kotlinretrofitsamplegetreq.api.RetrofitInstance2
import com.example.kotlinretrofitsamplegetreq.model.Post1
import retrofit2.Response

class Repository2 {
    suspend fun getPost1():Response<Post1>
    {
        return RetrofitInstance2.api1.getPost1()
    }

}