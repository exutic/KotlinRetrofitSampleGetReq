package com.example.kotlinretrofitsamplegetreq.model

data class Post1 (
    val status: String,
    val totalResults:Int,
    val articles:List<Post2Articles>
)