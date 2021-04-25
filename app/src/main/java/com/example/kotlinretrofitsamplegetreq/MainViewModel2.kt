package com.example.kotlinretrofitsamplegetreq

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinretrofitsamplegetreq.model.Post1
import com.example.kotlinretrofitsamplegetreq.repository.Repository2
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel2(private val repository1: Repository2) : ViewModel() {

    val myResponse1: MutableLiveData<Response<Post1>> = MutableLiveData()

    fun getPost1()
    {
        viewModelScope.launch {
            val response1 : Response<Post1> = repository1.getPost1()
            myResponse1.value = response1
        }
    }


}