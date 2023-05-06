package com.example.mvvmdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.model.UsersRepository

class UserViewModelAdvFactory(private val repository: UsersRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(UserViewModelAdv::class.java)) {
            UserViewModelAdv(repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}