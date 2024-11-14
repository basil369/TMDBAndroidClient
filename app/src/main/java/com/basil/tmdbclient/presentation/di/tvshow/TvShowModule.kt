package com.basil.tmdbclient.presentation.di.tvshow

import com.basil.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.basil.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.basil.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}