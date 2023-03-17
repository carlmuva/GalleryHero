package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.adapter.SuperHeroAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // con binding
        setContentView(binding.root)    //con binding
        //setContentView(R.layout.activity_main)  // sin binding
        initRecyclerView()
    }


    private fun initRecyclerView(){
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)   Sin binding
        //recyclerView.layoutManager = LinearLayoutManager(this)   Sin binding
        //recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) Sin binding

        binding.recyclerSuperHero.layoutManager=LinearLayoutManager(this)  // con binding
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) // con binding


    }
}