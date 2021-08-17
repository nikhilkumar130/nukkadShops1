package com.example.nukkadshops

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.visible.view.*

class Adapter(var context: Context,var s: Array<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.visible,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val item=s[position]
        holder.on(item,position)

    }

    override fun getItemCount(): Int {
        return s.size
    }
    inner class ViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView){
        init {
            itemView.nam
        }
        fun on(str:String,position: Int){

            itemView.nam.text=str
            itemView.setOnClickListener {
                var ss=s.get(position)
                Toast.makeText(context,"$ss",Toast.LENGTH_SHORT).show()
            }
        }
    }
}