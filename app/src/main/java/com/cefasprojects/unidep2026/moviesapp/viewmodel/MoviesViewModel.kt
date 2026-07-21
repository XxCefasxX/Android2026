package com.cefasprojects.unidep2026.moviesapp.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cefasprojects.unidep2026.intro.Movie
import com.cefasprojects.unidep2026.intro.Persona
import com.cefasprojects.unidep2026.intro.RetrofitServiceFactory
import com.cefasprojects.unidep2026.moviesapp.model.MovieResult
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {
    private val moviesService = RetrofitServiceFactory.bildRetrofitService()
    var lista = mutableStateListOf<Movie>()
    var movie by mutableStateOf<MovieResult?>(null)
        private set

    init {
        cargarPeliculas()
    }

    private fun cargarPeliculas() {

        viewModelScope.launch {

            try {

                val response = moviesService.ListMoviesByPopularity(
                    "f0de4e8ff996107753182dda2b588d0c"
                )

                lista.clear()
                lista.addAll(response.results)

            } catch (e: Exception) {
            }

        }

    }

    fun obtenerDetalle(id: String) {

        viewModelScope.launch {

            movie =
                moviesService.MovieDetails(movieId = id, apiKey = "f0de4e8ff996107753182dda2b588d0c")

        }
    }
}