package com.cefasprojects.unidep2026.moviesapp.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import coil3.compose.AsyncImage
import com.cefasprojects.unidep2026.intro.Movie

@Composable
fun MovieCard(movie: Movie) {
    Column {
        Row(){

            AsyncImage(
                model = "https://image.tmdb.org/t/p/w92/${movie.poster_path}",
                contentDescription = movie.title
            )
            Column() {
                Text(movie.title)
                Text(movie.vote_average.toString())
                Text(movie.release_date)
            }
        }
    }
}