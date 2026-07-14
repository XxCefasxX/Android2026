package com.cefasprojects.unidep2026.naveacion

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.cefasprojects.unidep2026.PersonasViewModel
import com.cefasprojects.unidep2026.intro.Persona


@Composable
fun Pantalla1(navController: NavController, personasViewmodel: PersonasViewModel) {
    Column {


        var texto by rememberSaveable { mutableStateOf("") }
        Text("Pantalla 1 con texto ${personasViewmodel.text}")

        Text("Pantalla 1")

        Button(
            onClick = {
                navController.navigate("pantalla2")
                //Asignar las propiedades de la clase desde el formulario
                personasViewmodel.lista.add(Persona(Nombre = "Juan", Genero = "H", Edad = 22))

            }
        ) {
            Text("Ir a Pantalla 2")
        }

        Button(
            onClick = {
                navController.navigate("pantalla3")
            }
        ) {
            Text("Ir a Pantalla 3")
        }
    }
}