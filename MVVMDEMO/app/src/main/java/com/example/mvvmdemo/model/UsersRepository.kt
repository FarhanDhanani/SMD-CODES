package com.example.mvvmdemo.model

import android.util.Log
import com.example.mvvmdemo.model.responses.Users
import com.example.mvvmdemo.model.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsersRepository {

    fun getUsers(): Call<Users> {
        return RetrofitInstance.api.getUsers()
    }

    fun getUsers1(): Call<Users> {
        return RetrofitInstance.api.getUsers()
    }
}