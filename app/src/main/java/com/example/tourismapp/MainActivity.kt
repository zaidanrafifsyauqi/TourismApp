package com.example.tourismapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismapp.CustomZoomClass.CenterZoomLayout
import com.example.tourismapp.Model.Places
import com.example.tourismapp.TourAdapter.TourAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init views
        val toursRV = findViewById<RecyclerView>(R.id.tours_RV)

        //init layout manager
        val layoutManager = CenterZoomLayout(this)

        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        toursRV.layoutManager = layoutManager

        // To Auto Center View
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(toursRV)
        toursRV.isNestedScrollingEnabled = false

        //add items to array list

        val places = ArrayList<Places>()

        places.add(
            Places(
            "Los Angles",
        "Los angeles is a soithern california citu and the center of the nations fil & television industry",
        4.5f,
            "https://images.unsplash.com/photo-1540155945626-66eacf57fcb9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=612&q=80"


        )
        )
        places.add(
            Places(
                "China",
                "China, Officially the people's republic of china, it has population around 1.428 Billion in 2017",
                4.5f,
                "https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"


            )
        )
        places.add(
            Places(
                "India",
                "India is the second largest populaton in the world, Indai is most visited country in the world",
                4.5f,
                "https://images.unsplash.com/photo-1524613032530-449a5d94c285?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2550&q=80"


            )
        )
        places.add(
            Places(
                "Indonesia",
                "From Sabang at the tip of Aceh to Merauke in the land of Papua, Indonesia consists of various ethnic groups, languages and religions.",
                4.5f,
                "https://images.unsplash.com/photo-1549982150-1129eb6aa6d3?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80"


            )
        )
        places.add(
            Places(
                "Prancis",
                "Prancis is the most popular tourist destination in the world, with 30 million foreign visitors peryear",
                4.5f,
                "https://images.unsplash.com/photo-1549144511-f099e773c147?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80"

            )
        )

        //add arraylist to recyclerview
        toursRV.adapter = TourAdapter(this,places)
    }
}