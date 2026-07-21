package com.cefasprojects.unidep2026.moviesapp.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.cefasprojects.unidep2026.moviesapp.viewmodel.MoviesViewModel

@Composable
fun ListScreen(moviesViewModel: MoviesViewModel){

    LazyColumn() {
        items(moviesViewModel.lista) { pelicula ->
            MovieCard(pelicula)
        }
    }
}