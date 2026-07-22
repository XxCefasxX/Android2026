package com.cefasprojects.unidep2026.moviesapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.cefasprojects.unidep2026.moviesapp.viewmodel.MoviesViewModel

@Composable
fun ActorDetallesScreen(moviesViewModel: MoviesViewModel) {
    val actor = moviesViewModel.actor
    val movies = moviesViewModel.actorMovies?.cast
    actor?.let {
        Column() {
            Text(actor.name)
            Text(actor.biography)

            movies?.let { pelis ->
                LazyColumn() {
                    items(pelis) {peli ->
                        Text(peli.title)
                    }
                }
            }

        }
    }
}