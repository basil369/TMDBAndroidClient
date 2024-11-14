package com.basil.tmdbclient.presentation.di.movie

import com.basil.tmdbclient.domain.usecase.GetMoviesUseCase
import com.basil.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.basil.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}