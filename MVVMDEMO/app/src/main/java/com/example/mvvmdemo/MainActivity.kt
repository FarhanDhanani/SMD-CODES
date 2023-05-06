package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mvvmdemo.databinding.ActivityMainBinding
import com.example.mvvmdemo.model.UsersRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userAdapter : UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prepareRecyclerView()

        val viewModel: UserViewModelAdv
        val userViewModelAdvFactory = UserViewModelAdvFactory(UsersRepository())
        viewModel = ViewModelProvider(this, userViewModelAdvFactory)[UserViewModelAdv::class.java]

//        val viewModel:  UserViewModel
//        viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        viewModel.getUsers()
        viewModel.observeUserLiveData().observe(this, Observer { userList ->
            userAdapter.setMovieList(userList)
        })
    }

    private fun prepareRecyclerView() {
        userAdapter = UserAdapter()
        binding.rvMovies.apply {
            layoutManager = GridLayoutManager(applicationContext,2)
            adapter = userAdapter
        }
    }
}