package com.cefasprojects.unidep2026.moviesapp.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cefasprojects.unidep2026.intro.Movie
import com.cefasprojects.unidep2026.intro.RetrofitServiceFactory
import com.cefasprojects.unidep2026.moviesapp.model.Actor
import com.cefasprojects.unidep2026.moviesapp.model.ActorCastResult
import com.cefasprojects.unidep2026.moviesapp.model.ActorDetailsResult
import com.cefasprojects.unidep2026.moviesapp.model.CastResult
import com.cefasprojects.unidep2026.moviesapp.model.MovieResult
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {
    private val moviesService = RetrofitServiceFactory.bildRetrofitService()
    var lista = mutableStateListOf<Movie>()
    var listaActores = mutableStateListOf<Actor>()
    var movie by mutableStateOf<MovieResult?>(null)
    var movieCast by mutableStateOf<CastResult?>(null)



    var actor by mutableStateOf<ActorDetailsResult?>(null)
    var actorMovies by mutableStateOf<ActorCastResult?>(null)

    init {
        cargarPeliculas()
    }

    private fun cargarPeliculas() {

        viewModelScope.launch {

            try {

                val response = moviesService.ListMoviesByPopularity()

                lista.clear()
                lista.addAll(response.results)

            } catch (e: Exception) {
            }

        }

    }

    fun obtenerDetalle(id: String) {

        viewModelScope.launch {

            movie = moviesService.MovieDetails(movieId = id)
            movieCast = moviesService.MovieCast(movieId = id)

        }
    }

    fun cargaActores() {
        viewModelScope.launch {
            val response = moviesService.ActorsList()

            listaActores.clear()
            listaActores.addAll(response.results)
        }
    }

    fun GetActorDetails(id: String) {
        viewModelScope.launch {
            actor = moviesService.ActorDetails(id)
            actorMovies = moviesService.GetActorMovies(id)


        }
    }

}