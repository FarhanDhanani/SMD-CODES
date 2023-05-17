package com.example.vmtutorial

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VMFatory(private var number: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityVM2::class.java)){
            return MainActivityVM2(number) as T
        }
        throw java.lang.IllegalArgumentException("No View Model Found")
    }
}