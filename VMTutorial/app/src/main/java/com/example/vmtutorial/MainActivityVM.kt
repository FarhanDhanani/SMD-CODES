package com.example.vmtutorial

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityVM:ViewModel() {
    var number = 0;
    fun addNumber(){
        number++
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("LOOG","i am cleared")
    }
}