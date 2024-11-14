package com.basil.tmdbclient.domain.usecase

import com.basil.tmdbclient.data.model.tvshow.TvShow
import com.basil.tmdbclient.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}