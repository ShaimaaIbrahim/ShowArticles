package com.android.app.moviesreviews.di

import com.android.app.moviesreviews.repository.ArticleRepository
import com.android.app.moviesreviews.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent


@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Provides
    fun provideMovieRepository(
        service: ApiService,
    ): ArticleRepository {
        return ArticleRepository(service)
    }
}