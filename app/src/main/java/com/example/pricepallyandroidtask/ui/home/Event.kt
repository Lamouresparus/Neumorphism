package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pricepallyandroidtask.ui.Colors
import com.example.pricepallyandroidtask.ui.home.data.Event
import com.gandiva.neumorphic.LightSource
import com.gandiva.neumorphic.neu
import com.gandiva.neumorphic.shape.Flat
import com.gandiva.neumorphic.shape.RoundedCorner

@Composable
fun Events(
    item: Event
) {
    Box(
        Modifier
            .padding(start = 8.dp)
            .neu(
                lightShadowColor = Color(Colors.lightShadow),
                darkShadowColor = Color.Black,
                shadowElevation = 6.dp,
                lightSource = LightSource.LEFT_TOP,
                shape = Flat(RoundedCorner(10.dp)),
            )
    ) {

        Column(
            modifier = Modifier
                .width(278.dp)
                .wrapContentHeight()
                .clip(RoundedCornerShape(10.dp))
                .background(Color(Colors.Mirage))
                .align(Alignment.TopCenter)

        ) {
            Image(
                painter = painterResource(id = item.image),
                contentDescription = item.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(156.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = item.date,
                fontSize = 10.sp,
                color = Color(Colors.GreenWhite),
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Text(
                text = item.name,
                fontSize = 12.sp,
                color = Color(Colors.GreenWhite),
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Text(
                text = item.location,
                fontSize = 10.sp,
                color = Color(Colors.Grey),
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    .neu(
                        lightShadowColor = Color(Colors.lightShadow),
                        darkShadowColor = Color.Black,
                        shadowElevation = 4.dp,
                        lightSource = LightSource.LEFT_TOP,
                        shape = Flat(RoundedCorner(10.dp)),
                    ), contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(Colors.Mirage))
                        .size(258.dp, 30.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Info",
                        tint = Color(Colors.Aqua)
                    )
                    Text(text = "Info", fontSize = 18.sp, color = Color(Colors.Aqua))
                }


            }
            Spacer(modifier = Modifier.height(12.dp))

        }
    }
}