package com.example.vmtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModelFactory = VMFatory(0)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityVM2::class.java)

        //val viewModel = ViewModelProvider(this).get(MainActivityVM2::class.java)
        val bt= findViewById<Button>(R.id.BT);
        val tv= findViewById<TextView>(R.id.TV);
        tv.text = viewModel.number.toString()
        bt.setOnClickListener {
            viewModel.addNumber()
            tv.text = viewModel.number.toString()
        }
    }
}
