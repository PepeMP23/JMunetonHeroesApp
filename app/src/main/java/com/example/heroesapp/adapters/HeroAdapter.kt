package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroAdapter(val heroes: List<Hero>, val onClick:(Hero)->Unit): RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    class HeroViewHolder(view: View): RecyclerView.ViewHolder(view){
        val heroImageView : ImageView = view.findViewById(R.id.hero_image)
        val heroNameTextView : TextView = view.findViewById(R.id.hero_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hero_item,parent,false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = heroes[position]
        holder.heroNameTextView.text = hero.name
        Picasso.get().load(hero.image).into(holder.heroImageView)
        holder.itemView.setOnClickListener {
            onClick(hero)
        }
    }
}