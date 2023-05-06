package com.example.mvvmdemo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.load.engine.Resource
import com.example.mvvmdemo.model.UsersRepository
import com.example.mvvmdemo.model.responses.Data
import com.example.mvvmdemo.model.responses.Users
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModelAdv(private val userRepsitory: UsersRepository): ViewModel() {
    private var usersLiveData = MutableLiveData<List<Data>>()

    fun getUsers() {
       val response = userRepsitory.getUsers();
        response.enqueue(object : Callback<Users> {
            override fun onResponse(call: Call<Users>, response: Response<Users>) {
                if (response.body()!=null){
                    usersLiveData.value = response.body()!!.data
                }
                else{
                    return
                }
            }
            override fun onFailure(call: Call<Users>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }
        })
    }

    fun observeUserLiveData() : LiveData<List<Data>> {
        return usersLiveData
    }
}