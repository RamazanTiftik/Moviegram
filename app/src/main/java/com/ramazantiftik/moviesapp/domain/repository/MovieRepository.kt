package com.ramazantiftik.moviesapp.domain.repository

import com.ramazantiftik.moviesapp.data.remote.dto.MovieDetailDto
import com.ramazantiftik.moviesapp.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search: String): MoviesDto

    suspend fun getMovieDetail(imdbId: String): MovieDetailDto

}