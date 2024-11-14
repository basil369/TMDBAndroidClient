package com.basil.tmdbclient.presentation.di

import com.basil.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.basil.tmdbclient.presentation.di.movie.MovieSubComponent
import com.basil.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent():MovieSubComponent
   fun createTvShowSubComponent():TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}