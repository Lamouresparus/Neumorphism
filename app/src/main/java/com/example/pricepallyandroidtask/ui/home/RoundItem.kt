package com.example.pricepallyandroidtask.ui.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pricepallyandroidtask.ui.Colors
import com.gandiva.neumorphic.LightSource
import com.gandiva.neumorphic.neu
import com.gandiva.neumorphic.shape.Flat
import com.gandiva.neumorphic.shape.RoundedCorner

@Composable
fun RoundItem(
    @DrawableRes imageResource: Int,
    itemName: String
) {

    Column {

        Box(
            modifier = Modifier
                .wrapContentSize()
                .padding(top = 8.dp, start = 8.dp, end = 4.dp)
                .neu(
                    lightShadowColor = Color.White.copy(0.1f),
                    darkShadowColor = Color.Black,
                    shadowElevation = 6.dp,
                    lightSource = LightSource.LEFT_TOP,
                    shape = Flat(RoundedCorner(50.dp)),
                ),
            contentAlignment = Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color(Colors.Mirage)),
                contentAlignment = Center){
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = itemName,
                modifier = Modifier.wrapContentSize()
            )
        }
        }
        Spacer(modifier = Modifier.size(6.dp))

        Text(
            text = itemName,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.align(CenterHorizontally)
        )

    }
}
