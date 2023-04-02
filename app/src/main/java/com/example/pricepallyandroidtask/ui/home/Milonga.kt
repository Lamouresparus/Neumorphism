package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pricepallyandroidtask.R
import com.example.pricepallyandroidtask.ui.Colors
import com.example.pricepallyandroidtask.ui.home.data.Milonga

@Composable
fun Milongas(
    item: Milonga
) {


    Box(
        modifier = Modifier
            .wrapContentSize(),
        contentAlignment = Alignment.Center
    ) {
        ShadowedShape(shape = RoundedCornerShape(10.dp), width = 278, height = 120)

        Row(
            Modifier
                .wrapContentSize()
                .padding(10.dp)

        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .align(Alignment.CenterVertically)
            ) {
                Image(
                    painter = painterResource(item.imageResource),
                    contentDescription = stringResource(id = R.string.milongas),
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(text = item.name, style = MaterialTheme.typography.subtitle1)

                Spacer(modifier = Modifier.height(6.dp))

                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "rating",
                        modifier = Modifier.size(16.dp),
                        tint = Color(Colors.Gold)
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    Text(
                        text = item.rating.toString(),
                        color = Color.White,
                        style = MaterialTheme.typography.subtitle2
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "(${item.numberOfRating})",
                        style = MaterialTheme.typography.subtitle2
                    )
                }
                Text(text = item.time, style = MaterialTheme.typography.subtitle2)

                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_near_me),
                        contentDescription = "near me",
                        modifier = Modifier.size(11.dp).align(Alignment.CenterVertically),
                        tint = Color(Colors.Ash)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(text = "${item.distance} away", style = MaterialTheme.typography.subtitle2)
                }

                Spacer(modifier = Modifier.height(2.dp))

                Divider(modifier = Modifier.width(148.dp), color = Color(Colors.SmokeyGray))

                Spacer(modifier = Modifier.height(6.dp))

                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_directions),
                        contentDescription = "directions",
                        modifier = Modifier.size(16.dp),
                        tint = Color(Colors.Aqua)
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    Text(
                        text = "Directions",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.body1
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(text = "+ Info", fontSize = 14.sp, style = MaterialTheme.typography.body1)
                }
            }

        }
    }
}