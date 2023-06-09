package com.international_presidential_school.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.international_presidential_school.R
import com.international_presidential_school.models.ratings.RatingDataItem


class RatingAdapter(var list: ArrayList<RatingDataItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rating_item,parent,false)
        return RatingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: RatingDataItem = list[position]
        if(holder is RatingViewHolder){
            holder.teacherName.text = model.teacher
            holder.teacherRating.text = model.rating.toString()
            holder.teacherDescription.text = model.description
            holder.dateOfRating.text = model.createdAt
        }
    }

    inner class RatingViewHolder(view: View): RecyclerView.ViewHolder(view){
        var teacherName: TextView = view.findViewById(R.id.teacherName)
        var teacherRating: TextView = view.findViewById(R.id.teacherRating)
        var teacherDescription: TextView = view.findViewById(R.id.teacherDescription)
        var dateOfRating: TextView = view.findViewById(R.id.dateOfRating)
    }
}