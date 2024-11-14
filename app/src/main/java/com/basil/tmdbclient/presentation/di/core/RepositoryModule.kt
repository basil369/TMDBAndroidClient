package com.basil.tmdbclient.presentation.di.core

import com.basil.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.basil.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.basil.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.basil.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.basil.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.basil.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.basil.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.basil.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.basil.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.basil.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.basil.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.basil.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.basil.tmdbclient.domain.repository.ArtistRepository
import com.basil.tmdbclient.domain.repository.MovieRepository
import com.basil.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}