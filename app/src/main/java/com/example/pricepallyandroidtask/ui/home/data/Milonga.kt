package com.example.pricepallyandroidtask.ui.home.data

import androidx.annotation.DrawableRes

data class Milonga(
    val name: String,
    val rating: Double,
    val numberOfRating: Int,
    val time: String,
    val distance: String,
    @DrawableRes val imageResource: Int
)