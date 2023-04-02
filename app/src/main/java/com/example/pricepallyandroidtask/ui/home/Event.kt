package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
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

@Composable
fun Events(
    item: Event
) {
    Box {

        ShadowedShape(shape = RoundedCornerShape(10.dp), width =278, height = 257)

        Column(
            modifier = Modifier
                .size(278.dp, 257.dp)
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
            Text(text = item.date, fontSize = 10.sp, color = Color(Colors.GreenWhite), modifier = Modifier.padding(horizontal = 10.dp))
            Text(
                text = item.name,
                fontSize = 12.sp,
                color = Color(Colors.GreenWhite),
                style = MaterialTheme.typography.subtitle1, modifier = Modifier.padding(horizontal = 10.dp)
            )
            Text(text = item.location, fontSize = 10.sp, color = Color(Colors.Grey), modifier = Modifier.padding(horizontal = 10.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp), contentAlignment = Alignment.Center){
                ShadowedShape(width = 258, height = 30, shape = RoundedCornerShape(10.dp))
                Row(modifier = Modifier.size(258.dp, 30.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Info",
                        tint = Color(Colors.Aqua)
                    )
                    Text(text = "Info", fontSize = 18.sp, color = Color(Colors.Aqua))
                }


            }
        }
    }
}