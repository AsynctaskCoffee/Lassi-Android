package com.lassi.common.extenstions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.lassi.domain.media.LassiConfig

fun ImageView.loadImage(source: String?) {
    Glide.with(context)
        .load(source ?: "")
        .thumbnail(0.1f)
        .override(200, 200) // resizes the image to these dimensions (in pixel)
        .fitCenter()
        .into(this)
}