package com.ramazantiftik.moviesapp.data.remote.dto

import com.ramazantiftik.moviesapp.domain.model.Movie

data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

//extension
fun MoviesDto.toMovieList(): List<Movie>{
    return Search.map { search ->
        Movie(search.Poster, search.Title, search.Year, search.imdbID)
    }
}