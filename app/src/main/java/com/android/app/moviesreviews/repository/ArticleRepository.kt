package com.android.app.moviesreviews.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.android.app.moviesreviews.network.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ArticleRepository @Inject constructor(val apiService: ApiService) {

    @ExperimentalPagingApi
    fun getAllMovies() = Pager(
        pagingSourceFactory = { ArticlePagingSource(apiService) },
        config = PagingConfig(
            pageSize = 10
        )
    ).flow

}
