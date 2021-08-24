package com.android.app.moviesreviews.di
/*
import android.app.Application
import androidx.room.Room
import com.android.app.moviesreviews.room.MovieDao
import com.android.app.moviesreviews.room.MovieDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(app: Application): MovieDatabase {
        return Room
            .databaseBuilder(app, MovieDatabase::class.java, "movies_table")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideMoviesDao(moviesDatabase: MovieDatabase): MovieDao{
        return moviesDatabase.movieDao()
    }

}*/

