package com.cefasprojects.unidep2026

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
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

@Composable
fun DatosPersona(nombre: String, edad: Int, genero: String) {
    Card(
        modifier = Modifier.background(Color.Cyan).padding(top = 5.dp)
    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.pajaro),
                contentDescription = "img",
                modifier = Modifier.size(100.dp)
            )


            Text(nombre,
                modifier = Modifier.padding(20.dp))
            Text("$edad")
            Text(genero)
        }
    }
}
@Composable
fun Header(){
    AsyncImage(
        model = "https://i.pinimg.com/originals/b4/7b/f3/b47bf39be60fbff9fed2d5252dbb2871.png",
        contentDescription = "img",
        modifier = Modifier.padding(top=20.dp)
    )
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