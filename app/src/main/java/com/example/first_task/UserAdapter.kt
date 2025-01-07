package com.example.first_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.first_task.models.User

class UserAdapter(private val userList: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userImage: ImageView = view.findViewById(R.id.ivUserImage)
        val userName: TextView = view.findViewById(R.id.tvUserName)
        val userPhone: TextView = view.findViewById(R.id.tvUserPhone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.userName.text = "${user.firstName} ${user.lastName}"
        holder.userPhone.text = user.phone

        // Load user image using Glide
        Glide.with(holder.itemView.context)
            .load(user.image) // URL of the image
            .placeholder(R.drawable.ic_launcher_background) // Placeholder image
            .into(holder.userImage)
    }

    override fun getItemCount(): Int = userList.size
}
