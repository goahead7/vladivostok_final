package com.example.vladivostok.Adapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.R

class VladivostokAdapter (private val items: List<Triple< String, Int, String>>) :
    RecyclerView.Adapter<VladivostokAdapter.ViewHolder>() {

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imgVL: ImageView? = null
    var deskVL: TextView? = null
    var textVL: TextView? = null

    init {
        imgVL = itemView.findViewById(R.id.imgVL)
        deskVL = itemView.findViewById(R.id.deskVL)
        textVL = itemView.findViewById(R.id.textVL)
    }
}

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VladivostokAdapter.ViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_vladivostok, parent, false)
    return VladivostokAdapter.ViewHolder(itemView)
}

override fun onBindViewHolder(holder: VladivostokAdapter.ViewHolder, position: Int) {
    holder.deskVL?.text = items[position].first
    holder.imgVL?.setImageResource(items[position].second)
    holder.textVL?.text = items[position].third
}

override fun getItemCount() : Int {
    return items.size
}
}