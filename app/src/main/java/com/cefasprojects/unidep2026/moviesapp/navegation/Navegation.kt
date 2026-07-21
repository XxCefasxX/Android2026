package com.cefasprojects.unidep2026.moviesapp.navegation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cefasprojects.unidep2026.moviesapp.viewmodel.MoviesViewModel
import com.cefasprojects.unidep2026.moviesapp.views.ActoresListScreen
import com.cefasprojects.unidep2026.moviesapp.views.DetallesScreen
import com.cefasprojects.unidep2026.moviesapp.views.ListScreen

@Composable
fun Navegation() {
    val moviesViewModel: MoviesViewModel = viewModel()
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        MovieNavBar(navController)
    }

    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "List",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("List") {
                ListScreen(navController, moviesViewModel)
            }
            composable("Detail/{id}") { backStackEntry ->

                val id = backStackEntry.arguments?.getString("id")!!.toInt()
                moviesViewModel.obtenerDetalle(id.toString())
                DetallesScreen(moviesViewModel)
            }
            composable("Actors") {
                moviesViewModel.cargaActores()
                ActoresListScreen(navController, moviesViewModel)
            }
        }
    }
}