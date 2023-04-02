package com.example.pricepallyandroidtask.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.pricepallyandroidtask.R

sealed class BottomBarScreen(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val iconResource: Int
) {

    object Home : BottomBarScreen("home", R.string.home, R.drawable.ic_home)
    object Search : BottomBarScreen("search", R.string.search, R.drawable.ic_search)
    object Calender : BottomBarScreen("calender", R.string.calendar, R.drawable.ic_calendar)
    object Notifications : BottomBarScreen("notification", R.string.notification, R.drawable.ic_notification)
}