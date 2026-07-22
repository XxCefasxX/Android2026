package com.cefasprojects.unidep2026.moviesapp.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.cefasprojects.unidep2026.moviesapp.viewmodel.MoviesViewModel

@Composable
fun ActoresListScreen(navController: NavController, moviesViewModel: MoviesViewModel) {
    val listaActores = moviesViewModel.listaActores
    LazyColumn {
        items(listaActores) { actor ->
            ActorCard(actor, onClick = {
                //moviesViewModel.GetActorDetails(actor.id.toString())
                navController.navigate("ActorDetail/${actor.id}")
            })
        }
    }
}