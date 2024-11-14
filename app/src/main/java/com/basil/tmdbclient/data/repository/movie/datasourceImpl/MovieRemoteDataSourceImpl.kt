package com.basil.tmdbclient.data.repository.movie.datasourceImpl

import com.basil.tmdbclient.data.api.TMDBService
import com.basil.tmdbclient.data.model.movie.MovieList
import com.basil.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

