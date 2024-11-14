package com.basil.tmdbclient.domain.usecase

import com.basil.tmdbclient.data.model.artist.Artist
import com.basil.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}