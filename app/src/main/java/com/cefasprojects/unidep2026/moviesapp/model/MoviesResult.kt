package com.cefasprojects.unidep2026.intro

data class MoviesResult(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)