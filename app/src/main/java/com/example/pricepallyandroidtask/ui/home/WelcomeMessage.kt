package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.pricepallyandroidtask.ui.Colors

@Composable
fun WelcomeMessage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "menu",
            tint = Color(Colors.Mirage),
            modifier = Modifier
                .padding(start = 16.dp, top = 14.dp)
                .size(24.dp, 16.dp)
                .align(Alignment.TopStart)
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 113.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(
                    Color(Colors.Mirage)
                )
        )
        Column(
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.Center)
        ) {
            Text(
                text = "Hi, Cassandra! ",
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "What are you looking for today?",
                style = MaterialTheme.typography.body2,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            HomeData()

        }

    }
}