package com.example.vmtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.w3c.dom.Text

class LiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        val tv = findViewById<TextView>(R.id.myTV)
        val viewModel = ViewModelProvider(this).get(LiveDataVM::class.java)
        viewModel.startTimer()
        viewModel.seconds().observe(this, Observer {
            tv.text = it.toString()
        })

    }
}