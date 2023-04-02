package com.example.pricepallyandroidtask.ui.home.data

import androidx.annotation.DrawableRes

data class Event(
    val date: String,
    val name: String,
    val location: String,
    @DrawableRes val image: Int
)