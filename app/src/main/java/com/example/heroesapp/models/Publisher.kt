package com.example.heroesapp.models

data class Publisher(val id: Int, val name: String, val image: String){
    companion object {
        val publishers = mutableListOf<Publisher>(
            // Marvel
            Publisher(1, "Marvel", "https://static.wikia.nocookie.net/logopedia/images/c/cd/Marvel_Entertainment_Logo_%282012%29.jpg/revision/latest?cb=20190325210512"),
            Publisher(2, "DC Comics", "https://static1.srcdn.com/wordpress/wp-content/uploads/2020/03/DC-Comics-Logo.jpg"),
        )
    }
}