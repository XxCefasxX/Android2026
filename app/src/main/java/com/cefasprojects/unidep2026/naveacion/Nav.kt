package com.cefasprojects.unidep2026.naveacion

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cefasprojects.unidep2026.BottomBar
import com.cefasprojects.unidep2026.PersonasViewModel


@Composable
fun Navegacion() {

    val navController = rememberNavController()
    val personasViewModel: PersonasViewModel = viewModel()
    Scaffold(
        bottomBar = {
            BottomBar(navController)
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = Modifier.padding(innerPadding)
        ) {

            composable("Home") {
                Pantalla1(navController,personasViewModel)
            }

            composable("pantalla2") {
                Pantalla2(navController,personasViewModel)
            }

            composable("pantalla3") {
                Pantalla3(navController)
            }

            composable(route = "pantalla4/{id}") {
                    backStackEntry ->

                val id = backStackEntry.arguments?.getString("id") ?: ""

                Pantalla4(
                    navController = navController,
                    personasViewmodel = personasViewModel,
                    id = id
                )
            }
        }
    }
}