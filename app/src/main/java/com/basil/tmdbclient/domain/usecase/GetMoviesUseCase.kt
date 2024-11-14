package com.basil.tmdbclient.domain.usecase

import com.basil.tmdbclient.data.model.movie.Movie
import com.basil.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}