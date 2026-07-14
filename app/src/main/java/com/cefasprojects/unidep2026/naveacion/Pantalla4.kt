package com.cefasprojects.unidep2026.naveacion

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.cefasprojects.unidep2026.PersonasViewModel

@Composable
fun Pantalla4(navController: NavController, personasViewmodel: PersonasViewModel, id: String) {
    Column {
        val persona = personasViewmodel.lista.find { it.id == id }
        Text("el id recibido es de${persona?.nombre}")
    }

}