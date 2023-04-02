package com.example.pricepallyandroidtask.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pricepallyandroidtask.R
import com.example.pricepallyandroidtask.ui.home.data.Event
import com.example.pricepallyandroidtask.ui.home.data.Item
import com.example.pricepallyandroidtask.ui.home.data.Milonga
import com.example.pricepallyandroidtask.ui.home.data.Teacher

@Composable
fun HomeData() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 24.dp, start = 16.dp, bottom = 24.dp)
            .verticalScroll(state = scrollState)
    ) {

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(
                    start = 8.dp,
                    end = 24.dp
                )
        ) {
            items(getItems()) { item ->
                RoundItem(
                    imageResource = item.imageResource,
                    itemName = stringResource(id = item.itemName)
                )
            }
        }

        Spacer(modifier = Modifier.height(7.dp))

        Text(text = "Milongas near you", style = MaterialTheme.typography.subtitle2)

        Spacer(modifier = Modifier.height(15.dp))

        LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {

            items(getMilongas()) { item ->
                Milongas(item)
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Text(text = "Teachers near you", style = MaterialTheme.typography.subtitle2)

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {

            items(getTeachers()) { item ->
                Teachers(item)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Events", style = MaterialTheme.typography.subtitle2)

        Spacer(modifier = Modifier.height(15.dp))

        LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {

            items(getEvents()) { item ->
                Events(item)
            }
        }


    }
}

fun getMilongas() = listOf<Milonga>(
    Milonga(
        "La Rosa Milonga",
        5.0,
        100,
        "From 15:30 to 18:00",
        "15 Km",
        R.drawable.milongas1
    ), Milonga(
        "La Rosa Milonga",
        5.0,
        100,
        "From 15:30 to 18:00",
        "15 Km",
        R.drawable.milongas_2
    )
)


fun getTeachers() = listOf(
    Teacher(
        "La Rosa Milonga",
        5.0,
        100,
        "20 years",
        "15 Km",
        R.drawable.clari
    ), Teacher(
        "La Rosa Milonga",
        5.0,
        100,
        "20 years",
        "15 Km",
        R.drawable.john
    )
)

fun getEvents() = listOf(
    Event(
        "Fri.Aug 22th at 15:00 - Aug 13",
        "El Cachivache Orkesta -NY Queer Tango",
        "Hungarian House of New York - New York",
        R.drawable.event_1
    ), Event(
        "Fri.Aug 22th at 15:00 - Aug 13",
        "El Cachivache Orkesta -NY Queer Tango",
        "Hungarian House of New York - New York",
        R.drawable.event_2
    )
)

fun getItems(): List<Item> = listOf(
    Item(R.string.milongas, R.drawable.ic_milongas),
    Item(R.string.teachers, R.drawable.ic_teachers),
    Item(R.string.schools, R.drawable.ic_schools)
)