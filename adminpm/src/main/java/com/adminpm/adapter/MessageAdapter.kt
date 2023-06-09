package com.adminpm.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adminpm.R
import com.adminpm.model.message.MessageResponseItem

class MessageAdapter(var messageList: ArrayList<MessageResponseItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.message, parent, false)
        return OnPostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: MessageResponseItem = messageList[position]
        if (holder is OnPostViewHolder) {
            holder.newTitle.text = model.message_title
            holder.newDesc.text = model.message_description
            holder.dateAdministration.text = model.createdAt
        }
    }

    inner class OnPostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val newTitle: TextView = view.findViewById(R.id.adminComplaintTitle_id)
        val newDesc:TextView = view.findViewById(R.id.adminComplaintDesc_id)
        val dateAdministration:TextView = view.findViewById(R.id.timeComplaint)
    }
}