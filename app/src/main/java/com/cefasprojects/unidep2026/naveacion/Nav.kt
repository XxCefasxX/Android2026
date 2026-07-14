package com.cefasprojects.unidep2026.naveacion

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cefasprojects.unidep2026.PersonasViewModel


@Composable
fun Navegacion() {

    //Poner una imagen de encabezado distinto en cada una
    //poner un text filed que pida un nombre y lo envie a la otra pantalla
    //el Text que dice el nombre de la patalla debera de decir bienvenido (texto recibido) a la pantalla1
    // o pantalla en la que se encuentre

    val navController = rememberNavController()
    val personasViewModel: PersonasViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "pantalla1"
    ) {

        composable("pantalla1") {
            Pantalla1(navController, personasViewModel)
        }

        composable("pantalla2") {
            Pantalla2(navController)
        }

        composable("pantalla3") {
            Pantalla3(navController)
        }
    }
}