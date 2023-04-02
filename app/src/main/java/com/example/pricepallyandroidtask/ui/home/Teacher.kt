package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pricepallyandroidtask.R
import com.example.pricepallyandroidtask.ui.Colors
import com.example.pricepallyandroidtask.ui.home.data.Teacher

@Composable
fun Teachers(
    item: Teacher
) {

    Box(
        modifier = Modifier
            .wrapContentSize(),
        contentAlignment = Alignment.TopCenter
    ) {

            ShadowedShape(
                shape = RoundedCornerShape(10.dp),
                width = 168,
                height = 168,
                modifier = Modifier.padding(top = 50.dp)
            )

            Column(modifier = Modifier.padding(top = 108.dp, start = 10.dp, end = 10.dp)) {
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
                Row {
                    Text(text = item.yearsOfExperience, style = MaterialTheme.typography.subtitle2)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "of experience",
                        color = Color.White,
                        style = MaterialTheme.typography.subtitle2
                    )

                }

                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_near_me),
                        contentDescription = "near me",
                        modifier = Modifier
                            .size(11.dp)
                            .align(Alignment.CenterVertically),
                        tint = Color(Colors.Ash)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(text = "${item.distance} away", style = MaterialTheme.typography.subtitle2)
                }
                Spacer(modifier = Modifier.height(2.dp))

                Divider(color = Color(Colors.SmokeyGray), modifier = Modifier.width(148.dp))
                Spacer(modifier = Modifier.height(7.dp))

                Row(
                    modifier = Modifier.width(148.dp),
                    horizontalArrangement = Arrangement.Center
                    ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_today),
                        contentDescription = "directions",
                        modifier = Modifier.size(16.dp),
                        tint = Color(Colors.Aqua)
                    )

                    Spacer(modifier = Modifier.width(11.dp))

                    Text(
                        text = "Book a Lesson",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.body1
                    )
                }

            }

        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = item.imageResource),
                contentDescription = item.name,
                modifier = Modifier.fillMaxSize()
            )
        }
        }
    }