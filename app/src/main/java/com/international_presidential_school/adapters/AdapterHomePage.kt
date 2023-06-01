package com.international_presidential_school.adapters

import com.international_presidential_school.R
import com.international_presidential_school.models.announce.HomeAnnounceItem


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdapterHomePage(val list: ArrayList<HomeAnnounceItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_page_item,parent,false)
        return HomePageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: HomeAnnounceItem = list[position]
        if(holder is HomePageViewHolder){
            holder.title.text = model.title
            holder.description.text = model.description
            holder.date.text = model.createdAt
        }
    }

    inner class HomePageViewHolder(view: View):RecyclerView.ViewHolder(view){
        var image: ImageView = view.findViewById(R.id.imageAdministration)
        var title: TextView = view.findViewById(R.id.titleAdministration)
        var description: TextView = view.findViewById(R.id.descriptionAdministration)
        var date: TextView = view.findViewById(R.id.dateAdministration)
    }
}