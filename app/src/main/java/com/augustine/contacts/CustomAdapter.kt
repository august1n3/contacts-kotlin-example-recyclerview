package com.augustine.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val contactLists: Array<ContactDetails>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.contactPhonenUmberText.text = contactLists[position].contactPhoneNumber
        holder.contactNameText.text = contactLists[position].contactName
    }

    override fun getItemCount(): Int {
        return contactLists.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val contactNameText: TextView
        val contactPhonenUmberText: TextView

        init{
           contactPhonenUmberText = view.findViewById(R.id.contact_phone_number)
           contactNameText = view.findViewById(R.id.contact_name)
        }

    }
}