package com.timzowen.easycoach.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.*
import com.timzowen.easycoach.model.Bookings
import com.timzowen.easycoach.model.pastTravels
import com.timzowen.easycoach.widgets.BookingCard
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(navController: NavController) {
    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()
    val trips = pastTravels()

    Scaffold(
        topBar = {
            androidx.compose.material3.TopAppBar(
                title = { Text(text = "Bookings") },
                colors = TopAppBarDefaults.topAppBarColors(Color(0xFFC03B28))
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            TabRow(
                selectedTabIndex = pagerState.currentPage,
                backgroundColor = Color(0xFFC03B28),
                contentColor = Color.White,
                modifier = Modifier.fillMaxWidth()
            ) {
                listOf("upcoming", "past", "Cancelled")
                    .forEachIndexed { index, title ->
                        Tab(
                            text = {
                                Text(
                                    text = title,
                                    modifier = Modifier.fillMaxWidth(),
                                    color = if (pagerState.currentPage == index) Color.White else
                                        Color.LightGray
                                )
                            },
                            modifier = Modifier.weight(1f),
                            selected = pagerState.currentPage == index,
                            onClick = {
                                scope.launch { pagerState.animateScrollToPage(index) }
                            },
                        )
                    }
            }
            Spacer(modifier = Modifier.height(16.dp))

            HorizontalPager(
                count = 3,
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { page ->
                when (page) {
                    0 -> UpcomingScreen()
                    1 -> PastScreen(trips)
                    2 -> CancelledScreen()
                }
            }
        }
    }
}






@Composable
fun UpcomingScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Upcoming Items")
    }
}

@Composable
fun PastScreen(trips: List<Bookings> = emptyList()) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        LazyColumn {
            items(items = trips) { trip ->
                BookingCard(trip)
            }
        }
    }
}

@Composable
fun CancelledScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Cancelled Items")
    }
}
//
//@Preview
//@Composable
//fun TripsStatusPreview(){
//    TripsStatus()
//}