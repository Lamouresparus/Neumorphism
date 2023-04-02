package com.example.pricepallyandroidtask.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pricepallyandroidtask.ui.calendar.CalendarScreen
import com.example.pricepallyandroidtask.ui.home.HomeScreen
import com.example.pricepallyandroidtask.ui.notification.NotificationScreen
import com.example.pricepallyandroidtask.ui.search.SearchScreen

@Composable
fun BottomNavGraph(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route, modifier = Modifier.padding(innerPadding)){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Search.route){
            SearchScreen()
        }
        composable(route = BottomBarScreen.Notifications.route){
            NotificationScreen()
        }
        composable(route = BottomBarScreen.Calender.route){
            CalendarScreen()
        }

    }
}