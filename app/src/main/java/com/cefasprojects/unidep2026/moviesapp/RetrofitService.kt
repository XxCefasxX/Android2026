package com.cefasprojects.unidep2026.intro


import com.cefasprojects.unidep2026.moviesapp.model.MovieResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface RetrofitService {

    @GET("discover/movie?sort_by=popularity.desc")
    suspend fun ListMoviesByPopularity(
        @Query("api_key") apiKey: String
    ): MoviesResult

    @GET("movie/{movie_id}?")
    suspend fun MovieDetails(
        @Path("movie_id") movieId: String,
        @Query("api_key") apiKey: String
    ): MovieResult

}

object RetrofitServiceFactory {
    fun bildRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}