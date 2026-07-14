package com.cefasprojects.unidep2026

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cefasprojects.unidep2026.naveacion.Navegacion
import com.cefasprojects.unidep2026.ui.theme.IntroAndroid2026Theme

class MainActivity : ComponentActivity() {
    val TAG = "CicloDeVIda"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntroAndroid2026Theme {

             Navegacion()

               //Crear 3 clases mas relacionadas con su tema
                //2 de las clases deben de estar relacionadas, como personas y puestos
                //crear los formularios para llenar la informacion de esas clases
                //crear sus respectivos viewmodels para llenar la informacion



            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntroAndroid2026Theme {
        Greeting("Android")
    }
}

@Composable
fun PrimerPaso() {
    var texto by remember { mutableStateOf("") }
    TextField(
        value = texto,
        onValueChange = { texto = it }
    )
}

@Composable
fun ColumnaComposse() {
    var texto by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }

    Column {
        TextField(
            value = texto,
            onValueChange = { texto = it }
        )
        Button(
            onClick = { texto2 = texto }
        ) {
            Text("Aceptar")
        }
        Text(texto2)
    }
}

@Composable
fun FilaComposse() {
    var texto by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }

    Row {
        TextField(
            value = texto,
            onValueChange = { texto = it }
        )
        Button(
            onClick = { texto2 = texto }
        ) {
            Text("Aceptar")
        }
        Text(texto2)
    }
}

//Contador de clics
//1 texto en donde se muestra el numero
//2 botones, uno para aumentar y otro apra restar