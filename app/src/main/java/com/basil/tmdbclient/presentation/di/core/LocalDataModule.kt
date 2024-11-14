package com.basil.tmdbclient.presentation.di.core

import com.basil.tmdbclient.data.db.ArtistDao
import com.basil.tmdbclient.data.db.MovieDao
import com.basil.tmdbclient.data.db.TvShowDao
import com.basil.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.basil.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.basil.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.basil.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.basil.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.basil.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}