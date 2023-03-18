package com.example.recyclerviewexample.adapter

import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    //val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName) // sin binding
    //val realName = view.findViewById<TextView>(R.id.tvRealName) // sin binding
    //val publisher = view.findViewById<TextView>(R.id.tvPublisher)// sin binding
    //val photo = view.findViewById<ImageView>(R.id.ivSuperHero)// sin binding


    fun render(superHeroModel: SuperHero, onClickListener:(SuperHero)->Unit) {

        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context)
            .load(superHeroModel.photo)
            .into(binding.ivSuperHero)

        itemView.setOnClickListener{onClickListener(superHeroModel)}

        /*binding.ivSuperHero.setOnClickListener {
            Toast.makeText(binding.ivSuperHero.context,
            superHeroModel.realName,
            Toast.LENGTH_SHORT)
                .show()
        }*/

/*        itemView.setOnClickListener {
            Toast.makeText(binding.ivSuperHero.context,
                superHeroModel.superhero,
                Toast.LENGTH_SHORT)
                .show()
        }*/

/*
        superHero.text = superHeroModel.superhero  sin binding
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(photo.context)
            .load(superHeroModel.photo)
            .into(photo)
*/

    }
}