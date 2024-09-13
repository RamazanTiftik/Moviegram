package com.ramazantiftik.moviesapp.data.remote

import com.ramazantiftik.moviesapp.data.remote.dto.MovieDetailDto
import com.ramazantiftik.moviesapp.data.remote.dto.MoviesDto
import com.ramazantiftik.moviesapp.util.Constans.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    //http://www.omdbapi.com/?i=tt3896198&apikey=2e7a9919 -> API KEY
    //http://www.omdbapi.com/?i=tt3896198&apikey=2e7a9919&s=batman ->movie screen
    //http://www.omdbapi.com/?i=tt3896198&apikey=2e7a9919&i=tt3896198 -> detail screen

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apiKey: String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbID: String,
        @Query("apikey") apiKey: String= API_KEY
    ) : MovieDetailDto

}