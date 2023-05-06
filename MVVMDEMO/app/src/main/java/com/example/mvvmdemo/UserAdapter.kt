package com.example.mvvmdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmdemo.databinding.UserLayoutBinding
import com.example.mvvmdemo.model.responses.Data


class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private var usersList = ArrayList<Data>()
    fun setMovieList(usersList: List<Data>) {
        this.usersList = usersList as ArrayList<Data>
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: UserLayoutBinding) : RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            UserLayoutBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(usersList[position].avatar)
            .into(holder.binding.userImage)
        holder.binding.movieName.text = usersList[position].first_name
    }

    override fun getItemCount(): Int {
        return usersList.size
    }
}
