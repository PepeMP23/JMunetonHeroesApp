package com.example.heroesapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroAdapter
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    private lateinit var heroesRecyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes)
        val publisherId = intent.getIntExtra("publisherId",0)
        val hero = Hero.heroes.filter { it.publisherId == publisherId }

        heroesRecyclerView = findViewById(R.id.heroes_recycleview)
        heroesRecyclerView.adapter = HeroAdapter(hero){ heroe ->
            Log.i("Hero click", heroe.name)
            val intent = Intent(this, HeroDetailActivity::class.java).apply {
                putExtra("heroeId", heroe.id)
            }
            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}