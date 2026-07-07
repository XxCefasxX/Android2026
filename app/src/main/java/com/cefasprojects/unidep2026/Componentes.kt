package com.cefasprojects.unidep2026

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.cefasprojects.unidep2026.intro.Persona

@Composable
fun Formulario() {
    var lista = remember { mutableListOf<Persona>() }
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var genero by remember { mutableStateOf("") }
    Column() {
        TextField(
            value = nombre,
            onValueChange = { nombre = it }
        )
        TextField(
            value = edad,
            onValueChange = { edad = it }
        )
        TextField(
            value = genero,
            onValueChange = { genero = it }
        )
        Button(onClick = {

            lista.add(Persona(nombre, edad.toInt(), genero))
            nombre = ""
            edad = ""
            genero = ""
        }) {
            Text("Agregar")
        }

        LazyColumn() {
            items(lista) { it ->
                DatosPersona(it.nombre, it.edad, it.genero)
            }
        }
    }
}

fun DatosPersona(nombre: String, edad: Int, genero: String) {
//mostar la informacion de la persona
}

@Composable
fun CajaDeTexto() {
    var texto by remember { mutableStateOf("") }
    TextField(
        value = texto,
        onValueChange = { texto = it }
    )
}

@Composable
fun AgregarPersona() {
    //boton de agregar
}