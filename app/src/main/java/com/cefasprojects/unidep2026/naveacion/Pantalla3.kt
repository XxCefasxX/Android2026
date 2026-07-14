package com.cefasprojects.unidep2026.naveacion

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.cefasprojects.unidep2026.PersonasViewModel
import com.cefasprojects.unidep2026.intro.Persona

@Composable
fun Pantalla3(
    navController: NavController
) {
    Column {
        Text("Pantalla 3")

        Button(
            onClick = {
                navController.navigate("pantalla1")
            }
        ) {
            Text("Ir a Pantalla 1")
        }

        Button(
            onClick = {
                navController.navigate("pantalla2")
            }
        ) {
            Text("Ir a Pantalla 2")
        }


//        Text(persona.nombre)
//        Text(persona.genero)
//        Text(persona.edad.toString())
    }
}