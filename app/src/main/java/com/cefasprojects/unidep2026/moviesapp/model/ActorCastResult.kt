package com.cefasprojects.unidep2026.moviesapp.model

data class ActorCastResult(
    val cast: List<ActorCast>,
    val crew: List<ActorCrew>,
    val id: Int
)