package com.example.kotlinretrofitsamplegetreq.api

import com.example.kotlinretrofitsamplegetreq.utils.Constants.Companion.Base_URL1
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Base_URL1)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api : SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}