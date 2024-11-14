package com.basil.tmdbclient.presentation.di.artist

import com.basil.tmdbclient.domain.usecase.GetArtistsUseCase
import com.basil.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.basil.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}