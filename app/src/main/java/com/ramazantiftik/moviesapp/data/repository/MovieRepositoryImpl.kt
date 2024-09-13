package com.ramazantiftik.moviesapp.data.repository

import com.ramazantiftik.moviesapp.data.remote.MovieAPI
import com.ramazantiftik.moviesapp.data.remote.dto.MovieDetailDto
import com.ramazantiftik.moviesapp.data.remote.dto.MoviesDto
import com.ramazantiftik.moviesapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI): MovieRepository {

    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId)
    }

}