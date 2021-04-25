package com.example.kotlinretrofitsamplegetreq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinretrofitsamplegetreq.repository.Repository
import com.example.kotlinretrofitsamplegetreq.repository.Repository2

class MainActivity : AppCompatActivity() {

    private  lateinit var  viewModel: MainViewModel
    private  lateinit var  viewModel2: MainViewModel2



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById<TextView>(R.id.textView)
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory)
            .get(MainViewModel::class.java)

        viewModel.getPost()

        viewModel.myResponse.observe(this, Observer { response ->
            if (response.isSuccessful)
            {
                textView.text = response.body()?.userId.toString()
                textView.append("\n"+response.body()?.id.toString())
                textView.append("\n"+response.body()?.title!!)
                textView.append("\n"+response.body()?.body!!)
                Log.d("onCreate: Response", response.body()?.userId.toString())
                Log.d("onCreate: Response", response.body()?.id.toString())
                Log.d("onCreate: Response", response.body()?.title!!)
                Log.d("onCreate: Response", response.body()?.body!!)
            }
            else
            {
                Log.d("onCreate: Response", response.errorBody().toString())
                textView.text = response.errorBody().toString()

            }

        })

        val textView2 : TextView = findViewById<TextView>(R.id.textView2)
        val repository2 = Repository2()
        val viewModelFactory2 = MainViewModelFactory2(repository2)

        viewModel2 = ViewModelProvider(this,viewModelFactory2)
            .get(MainViewModel2::class.java)

        viewModel2.getPost1()

        viewModel2.myResponse1.observe(this, Observer { response1 ->
            if (response1.isSuccessful)
            {
                textView2.text = response1.body()?.status.toString()
                textView2.append("\n"+response1.body()?.totalResults.toString())
                Log.d("onCreate: Response", response1.body()?.status.toString())
                Log.d("onCreate: Response", response1.body()?.totalResults.toString())
            }
            else
            {
                Log.d("onCreate: Response", response1.errorBody().toString())
                textView2.text = response1.errorBody().toString()
            }
        })






    }
}