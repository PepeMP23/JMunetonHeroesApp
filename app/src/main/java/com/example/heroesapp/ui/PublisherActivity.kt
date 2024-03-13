package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.Hero

class PublisherActivity : AppCompatActivity() {
    private lateinit var publisherRecyclerView: RecyclerView
    private lateinit var logoutBtn: Button
    private lateinit var publisherTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publisher)

        logoutBtn = findViewById(R.id.btn_logout)
        logoutBtn.setOnClickListener {
            val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", false)
            editor.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        publisherRecyclerView = findViewById(R.id.publisher_recycleview)
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers) { publisher ->
            Log.i("Publisher Clicked", publisher.name)
            val intent = Intent(this, HeroesActivity::class.java).apply {
                putExtra("publisherId", publisher.id)
            }
            startActivity(intent)
        }
        publisherRecyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}