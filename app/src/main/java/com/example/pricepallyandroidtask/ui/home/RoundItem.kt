package com.example.pricepallyandroidtask.ui.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pricepallyandroidtask.ui.Colors

@Composable
fun RoundItem(
    @DrawableRes imageResource: Int,
    itemName: String
) {

    Column {

        Box(
            modifier = Modifier
                .wrapContentSize()
                .clip(CircleShape),
            contentAlignment = Alignment.Center
        ) {
            ShadowedShape()
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = itemName,
                modifier = Modifier.wrapContentSize()
            )
        }
        Spacer(modifier = Modifier.size(6.dp))

        Text(
            text = itemName,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.align(CenterHorizontally)
        )

    }
}
