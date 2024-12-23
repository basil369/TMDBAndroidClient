package com.basil.tmdbclient.data.repository.tvshow.datasourceImpl

import com.basil.tmdbclient.data.api.TMDBService
import com.basil.tmdbclient.data.model.tvshow.TvShowList
import com.basil.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

