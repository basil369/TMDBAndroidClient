package com.basil.tmdbclient.data.repository.artist.datasource

import com.basil.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}