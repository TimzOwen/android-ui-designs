package com.timzowen.easycoach.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.timzowen.easycoach.widgets.BookingCard


@Composable
fun BookingScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        BookingCard()
    }
}
