package com.basil.tmdbclient.data.repository.tvshow.datasource

import com.basil.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}