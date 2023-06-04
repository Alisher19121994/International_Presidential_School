package com.adminpm.adapter

import com.adminpm.R

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adminpm.model.admin.AdminHomeItem


class PostAdapter(var postList: ArrayList<AdminHomeItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_page_item, parent, false)
        return OnPostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: AdminHomeItem = postList[position]
        if (holder is OnPostViewHolder) {
            holder.newTitle.text = model.title
            holder.newDesc.text = model.description
            holder.dateAdministration.text = model.createdAt
        }
    }

    inner class OnPostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val newTitle: TextView = view.findViewById(R.id.newItemTitle_id)
        val newDesc:TextView = view.findViewById(R.id.newTitleDescs_id)
        val dateAdministration:TextView = view.findViewById(R.id.dateAdministration)
    }
}