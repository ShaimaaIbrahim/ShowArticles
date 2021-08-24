package com.android.app.moviesreviews.repository

import android.util.Log
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.android.app.moviesreviews.model.Result
import com.android.app.moviesreviews.network.ApiService
import com.android.app.moviesreviews.utils.constants.INITIAL_PAGE
import javax.inject.Inject
import javax.inject.Singleton

@ExperimentalPagingApi
@Singleton
class ArticlePagingSource @Inject constructor(val apiService: ApiService): PagingSource<Int, Result>(){
   
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
    }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
             val page = params.key ?: INITIAL_PAGE

        val response = apiService.getAllArticles("all" , params.loadSize).results

            LoadResult.Page(
                data = response!!,
                prevKey = if (page == INITIAL_PAGE) null else page - 1,
                nextKey = if (response.isEmpty()) null else page + 1
            )

        } catch (e: Exception) {
            Log.e("shaimaa==========", e.message!!)
            LoadResult.Error(e)
        }
    }

}