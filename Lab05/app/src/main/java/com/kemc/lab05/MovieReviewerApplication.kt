package com.kemc.lab05

import android.app.Application
import com.kemc.lab05.data.movies
import com.kemc.lab05.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}