package com.example.heroesapp.mockdata

import com.example.heroesapp.models.User

class MockData {
    companion object{
        val users = listOf<User>(
            User(email="prueba@gmail.com", password="1234"),
            User(email="pepe@gmail.com", password="1234"),
            User(email="admin@gmail.com", password="1234")
        )
    }
}