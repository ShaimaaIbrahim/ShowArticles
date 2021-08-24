package com.android.app.moviesreviews.network

import com.android.app.moviesreviews.model.MovieResponse
import com.android.app.moviesreviews.utils.constants.API_KEY
import retrofit2.http.*

interface ApiService {

@Headers("Accept: application/json")
@GET("reviews/{type}.json")
suspend fun getAllArticles(
        @Path("type") type: String,
        @Query("offset") offset:Int,
        @Query("api-key") apiKey: String = API_KEY,
) : MovieResponse


}