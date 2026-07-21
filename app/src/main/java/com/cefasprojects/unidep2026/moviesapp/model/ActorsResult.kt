package com.cefasprojects.unidep2026.moviesapp.model

data class ActorsResult(
    val page: Int,
    val results: List<Actor>,
    val total_pages: Int,
    val total_results: Int
)