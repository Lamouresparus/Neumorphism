package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.pricepallyandroidtask.R
import com.example.pricepallyandroidtask.ui.Colors

@Composable
fun HomeScreen (){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(Colors.DragonGreen),
                        Color(Colors.NeonBlue)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        WelcomeMessage(Modifier.align(Alignment.TopCenter))
    }
}