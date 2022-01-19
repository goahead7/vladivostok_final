package com.example.vladivostok.Adapter;


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.R

class RusskiyAdapter (private val items: List<Triple< String, Int, String>>) :
    RecyclerView.Adapter<RusskiyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgRU: ImageView? = null
        var deskRU: TextView? = null
        var textRU: TextView? = null

        init {
            imgRU = itemView.findViewById(R.id.imgRU)
            deskRU = itemView.findViewById(R.id.deskRU)
            textRU = itemView.findViewById(R.id.textRU)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RusskiyAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_russkiy, parent, false)
        return RusskiyAdapter.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RusskiyAdapter.ViewHolder, position: Int) {
        holder.deskRU?.text = items[position].first
        holder.imgRU?.setImageResource(items[position].second)
        holder.textRU?.text = items[position].third
    }

    override fun getItemCount() : Int {
        return items.size
    }
}