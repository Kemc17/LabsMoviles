package com.kemc.lab05.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.kemc.lab05.data.model.MovieModel
import com.kemc.lab05.databinding.MovieItemBinding

class MovieRecyclerViewHolder (private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit){
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movie1Card.setOnClickListener{
            clickListener(movie)
        }
    }
}