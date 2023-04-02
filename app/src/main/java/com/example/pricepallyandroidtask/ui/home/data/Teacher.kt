package com.example.pricepallyandroidtask.ui.home.data

import androidx.annotation.DrawableRes

data class Teacher(
    val name: String,
    val rating: Double,
    val numberOfRating: Int,
    val yearsOfExperience: String,
    val distance: String,
    @DrawableRes
    val imageResource: Int
)