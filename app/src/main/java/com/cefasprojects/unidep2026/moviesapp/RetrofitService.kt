package com.cefasprojects.unidep2026.intro


import com.cefasprojects.unidep2026.moviesapp.API_KEY
import com.cefasprojects.unidep2026.moviesapp.model.ActorCastResult
import com.cefasprojects.unidep2026.moviesapp.model.ActorDetailsResult
import com.cefasprojects.unidep2026.moviesapp.model.ActorsResult
import com.cefasprojects.unidep2026.moviesapp.model.CastResult
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
        @Query("api_key") apiKey:String = API_KEY
    ): MoviesResult

    @GET("movie/{movie_id}?")
    suspend fun MovieDetails(
        @Path("movie_id") movieId: String,
        @Query("api_key")apiKey:String = API_KEY
    ): MovieResult

    @GET("movie/{movie_id}/credits?")
    suspend fun MovieCast(
        @Path("movie_id") movieId: String,
        @Query("api_key")apiKey:String = API_KEY
    ): CastResult

    @GET("person/popular?")
    suspend fun ActorsList(
        @Query("api_key")apiKey:String = API_KEY
    ): ActorsResult

    @GET("person/{actor_id}?")
    suspend fun ActorDetails(
        @Path("actor_id") actorId: String,
        @Query("api_key")apiKey:String = API_KEY
    ): ActorDetailsResult

    @GET("{actor_id}/movie_credits?")
    suspend fun GetActorMovies(
        @Path("actor_id") actorId: String,
        @Query("api_key")apiKey:String = API_KEY
    ): ActorCastResult
}

object RetrofitServiceFactory {
    fun bildRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}