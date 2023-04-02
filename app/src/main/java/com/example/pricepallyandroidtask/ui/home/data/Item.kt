package com.example.pricepallyandroidtask.ui.home.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Item(
    @StringRes val itemName: Int,
    @DrawableRes val imageResource: Int
)