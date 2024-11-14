package com.basil.tmdbclient.data.repository.movie.datasource

import com.basil.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}