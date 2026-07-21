package com.cefasprojects.unidep2026.moviesapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.cefasprojects.unidep2026.moviesapp.viewmodel.MoviesViewModel

@Composable
fun DetallesScreen(moviesViewModel: MoviesViewModel) {
    val movie = moviesViewModel.movie
    val movieCast = moviesViewModel.movieCast

    movie?.let { pelicula ->
        Column()   {
               Text(pelicula.title)
               Text(pelicula.overview)

               movieCast?.let { reparto ->
                   LazyColumn() {
                       items(reparto.cast) { actor ->
                           Text("${actor.name}- ${actor.character}")
                       }
                   }
               }
           }
    }
    //moviesViewModel.movieCast
}