package com.android.app.moviesreviews.ui.moviesList

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.android.app.moviesreviews.repository.ArticleRepository
import kotlinx.coroutines.flow.Flow
import com.android.app.moviesreviews.model.Result

class MovieListViewModel @ViewModelInject constructor(private val repository: ArticleRepository):ViewModel() {

   private lateinit var currentSearchResult: Flow<PagingData<Result>>


    @ExperimentalPagingApi
    fun getAllMovies(): Flow<PagingData<Result>> {
        val result = repository.getAllMovies()
            .cachedIn(viewModelScope)
        currentSearchResult= result

        return currentSearchResult
    }


}