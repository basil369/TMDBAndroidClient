package com.basil.tmdbclient.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.basil.tmdbclient.data.model.artist.Artist
import com.basil.tmdbclient.data.model.movie.Movie
import com.basil.tmdbclient.data.model.tvshow.TvShow


@Database(entities = [Movie::class, TvShow::class, Artist::class],
version = 1,
exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
abstract fun movieDao(): MovieDao
abstract fun tvDao(): TvShowDao
abstract fun artistDao(): ArtistDao

}