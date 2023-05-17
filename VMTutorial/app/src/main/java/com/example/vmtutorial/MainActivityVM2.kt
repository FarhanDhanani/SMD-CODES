package com.example.vmtutorial

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityVM2(number: Int):ViewModel() {
    var number = 0;
    init {
        this.number = number;
    }
    fun addNumber(){
        number++
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("LOOG","i am cleared")
    }
}