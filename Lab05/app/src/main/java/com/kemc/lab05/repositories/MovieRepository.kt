package com.kemc.lab05.repositories

import com.kemc.lab05.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {
    fun getMovies() = movies
    fun addMovies(newMovie: MovieModel) = movies.add(newMovie)
}