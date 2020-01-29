package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val users: List<String> = listOf()): RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val context: Context = parent.context
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.activity_main_item, parent, false)

        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.users.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.updateWithUser(this.users.get(position))
    }

}
