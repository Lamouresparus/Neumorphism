package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pricepallyandroidtask.ui.Colors

@Composable
fun ShadowedShape(
    shape: Shape = CircleShape,
    width: Int = 100,
    height: Int = 100,
    elevationWidth: Int = 4,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size((width.plus(elevationWidth.times(2)).dp), height.plus(elevationWidth.times(2)).dp)
            .clip(shape)
    ) {
        Box(
            modifier = Modifier
                .size(width.dp, height.dp)
                .padding(start = 2.8.dp, top = 2.5.dp)
                .clip(shape)
                .background(Color.White.copy(0.2f))
                .align(
                    Alignment.TopStart
                )
        )
        Box(
            modifier = Modifier
                .size(width.dp, height.dp)
                .padding(end = 2.dp)
                .clip(shape)
                .background(Color.Black.copy(0.5f))
                .align(
                    Alignment.BottomEnd
                )
        )

        Box(
            modifier = Modifier
                .size(width.dp, height.dp)
                .clip(shape)
                .background(Color(Colors.Mirage))
                .align(
                    Alignment.Center
                )
        )
    }
}