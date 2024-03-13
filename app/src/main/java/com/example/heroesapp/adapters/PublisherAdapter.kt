package com.example.heroesapp.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(val publishers: List<Publisher>, val Onclick:(Publisher)->Unit): RecyclerView.Adapter<PublisherAdapter.PublisherViewHolder>() {
    class PublisherViewHolder(val view:View) :RecyclerView.ViewHolder(view){
        val publisherTextView : TextView = view.findViewById(R.id.publisher_name)
        val publisherImage : ImageView = view.findViewById(R.id.publisher_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item,parent,false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publishers.size
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publishers[position]
        holder.publisherTextView.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)
        holder.view.setOnClickListener {
            Onclick(publisher)
        }
    }
}