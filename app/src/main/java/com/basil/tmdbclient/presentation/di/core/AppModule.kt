package com.basil.tmdbclient.presentation.di.core

import android.content.Context
import com.basil.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.basil.tmdbclient.presentation.di.movie.MovieSubComponent
import com.basil.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class,TvShowSubComponent::class,ArtistSubComponent::class])
class AppModule(private val context: Context) {

 @Singleton
 @Provides
 fun provideApplicationContext():Context{
     return context.applicationContext
 }





}