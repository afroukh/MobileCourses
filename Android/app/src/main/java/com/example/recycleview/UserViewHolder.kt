package com.example.recycleview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var textView: TextView

    init {
        this.textView = itemView.findViewById(R.id.activity_main_item_title)
    }

    fun updateWithUser(userName: String) {
        this.textView.text = userName
    }
}
