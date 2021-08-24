package com.android.app.moviesreviews.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

//@JsonClass(generateAdapter = true)
data class MovieResponse(
    @Json(name = "copyright")
    var copyright: String?,
    @Json(name = "has_more")
    var hasMore: Boolean?,
    @Json(name = "num_results")
    var numResults: Int?,
    @Json(name = "results")
    var results: List<Result>?,
    @Json(name = "status")
    var status: String?
)

@Parcelize
data class Link(
    @Json(name = "suggested_link_text")
    var suggestedLinkText: String?,
    @Json(name = "type")
    var type: String?,
    @Json(name = "url")
    var url: String?
) : Parcelable

@Parcelize
data class Multimedia(
    @Json(name = "height")
    var height: Int?,
    @Json(name = "src")
    var src: String?,
    @Json(name = "type")
    var type: String?,
    @Json(name = "width")
    var width: Int?
) : Parcelable