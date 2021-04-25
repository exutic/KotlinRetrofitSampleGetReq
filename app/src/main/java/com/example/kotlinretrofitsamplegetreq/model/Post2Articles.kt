package com.example.kotlinretrofitsamplegetreq.model

import com.google.gson.annotations.SerializedName

data class Post2Articles(
    val source: Post3Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)