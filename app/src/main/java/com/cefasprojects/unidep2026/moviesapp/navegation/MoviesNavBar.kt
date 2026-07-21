package com.cefasprojects.unidep2026.moviesapp.navegation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MovieNavBar(navController: NavController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("List")
            },
            icon = {
                Icon(Icons.Default.Home, null)
            },
            label = {
                Text("Lista")
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate("Pantalla2")
            },
            icon = {
                Icon(Icons.Default.Person, null)
            },
            label = {
                Text("P2")
            })
    }
}