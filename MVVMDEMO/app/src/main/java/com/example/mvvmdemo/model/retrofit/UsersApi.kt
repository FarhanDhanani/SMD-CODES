package com.example.mvvmdemo.model.retrofit


import com.example.mvvmdemo.model.responses.Users
import retrofit2.Call
import retrofit2.http.GET

interface UsersApi {
    @GET("api/users")
    fun getUsers() : Call<Users>
}

