package com.android.app.moviesreviews.model


import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Result(
    @Json(name = "byline")
    var byline: String?,
    @Json(name = "critics_pick")
    var criticsPick: Int?,
    @Json(name = "date_updated")
    var dateUpdated: String?,
    @Json(name = "display_title")
    var displayTitle: String?,
    @Json(name = "headline")
    var headline: String?,
    @Json(name = "link")
    var link: Link?,
    @Json(name = "mpaa_rating")
    var mpaaRating: String?,
    @Json(name = "multimedia")
    var multimedia: Multimedia?,
    @Json(name = "opening_date")
    var openingDate: String?,
    @Json(name = "publication_date")
    var publicationDate: String?,
    @Json(name = "summary_short")
    var summaryShort: String?
): Parcelable