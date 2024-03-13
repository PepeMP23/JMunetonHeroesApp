package com.example.heroesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroDetailActivity : AppCompatActivity() {
    private lateinit var heroNameTextView: TextView
    private lateinit var heroImaageView: ImageView
    private lateinit var heroDescriptionTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero_detail)

        heroNameTextView = findViewById(R.id.hero_name_title)
        heroImaageView = findViewById(R.id.hero_image_detail)
        heroDescriptionTextView = findViewById(R.id.hero_description)

        val heroId = intent.getIntExtra("heroeId",0)
        val hero = Hero.heroes.find { it.id == heroId }
        heroNameTextView.text = hero?.name
        heroDescriptionTextView.text = hero?.description
        Picasso.get().load(hero?.image).into(heroImaageView)
    }
}