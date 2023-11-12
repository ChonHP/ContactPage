package com.example.contactpage

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomContactAdapter (private val mList : List<ContactItem>) : RecyclerView.Adapter<CustomContactAdapter.ViewHolder>() {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val image: TextView = itemView.findViewById(R.id.imageBase)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)



        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewHolder = mList[position]
        holder.txtName.text = itemViewHolder.name
        holder.image.text = itemViewHolder.name[0].toString()
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, ContactDetail::class.java)
            intent.putExtra("id", itemViewHolder.id)
            intent.putExtra("name", itemViewHolder.name)
            intent.putExtra("phone", itemViewHolder.phone)
            intent.putExtra("email", itemViewHolder.email)
            holder.itemView.context.startActivity(intent)
        }
        holder.itemView.setOnLongClickListener {
            val context = holder.itemView.context
            val messageBoxView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet, null)
            val messageBoxBuilder = AlertDialog.Builder(context).setView(messageBoxView)
            val  messageBoxInstance = messageBoxBuilder.show()
            return@setOnLongClickListener true
        }

    }

}