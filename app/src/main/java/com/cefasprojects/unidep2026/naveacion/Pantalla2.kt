package com.cefasprojects.unidep2026.naveacion

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.cefasprojects.unidep2026.DatosPersona
import com.cefasprojects.unidep2026.PersonasViewModel

@Composable
fun Pantalla2(navController: NavController, personasViewmodel: PersonasViewModel) {
    Column {
        Text("Pantalla 2")

        Button(
            onClick = {
                navController.navigate("pantalla1")
            }
        ) {
            Text("Ir a Pantalla 1")
        }

        Button(
            onClick = {
                navController.navigate("pantalla3")
            }
        ) {
            Text("Ir a Pantalla 3")
        }
        LazyColumn() {
            items(personasViewmodel.lista) { persona ->
                DatosPersona(
                    nombre = persona.nombre,
                    edad = persona.edad,
                    genero = persona.genero,
                    onClick = {
                        Log.d("NAV", "Click en ${persona.id}")
                        navController.navigate("pantalla4/${persona.id}")
                    })

            }
        }
    }
}