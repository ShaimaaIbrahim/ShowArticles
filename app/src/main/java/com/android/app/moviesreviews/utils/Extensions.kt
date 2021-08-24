package com.android.app.moviesreviews.utils

import android.widget.ImageView
import com.android.app.moviesreviews.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadImage(url : String){
    if (url.isNotEmpty())
        Glide.with(context)
            .load(url)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background))
            .into(this)

    else this.setImageResource(R.drawable.ic_launcher_background)
}