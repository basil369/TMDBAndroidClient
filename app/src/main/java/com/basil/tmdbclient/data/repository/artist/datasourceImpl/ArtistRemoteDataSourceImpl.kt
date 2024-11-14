package com.basil.tmdbclient.data.repository.artist.datasourceImpl

import com.basil.tmdbclient.data.api.TMDBService
import com.basil.tmdbclient.data.model.artist.ArtistList
import com.basil.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

