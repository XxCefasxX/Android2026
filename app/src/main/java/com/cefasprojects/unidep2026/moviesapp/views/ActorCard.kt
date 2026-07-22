package com.cefasprojects.unidep2026.moviesapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.cefasprojects.unidep2026.moviesapp.model.Actor

@Composable
fun ActorCard(
    actor: Actor,
    onClick: () -> Unit
) {

    Card(onClick = onClick) {
       Column() {
           Text(actor.name)
       }
    }
}