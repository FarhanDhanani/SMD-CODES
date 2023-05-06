package com.example.mvvmdemo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.model.responses.Data
import com.example.mvvmdemo.model.responses.Users
import com.example.mvvmdemo.model.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel: ViewModel() {
    private var usersLiveData = MutableLiveData<List<Data>>()

    fun getUsers() {
        RetrofitInstance.api.getUsers().enqueue(object : Callback<Users> {
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
