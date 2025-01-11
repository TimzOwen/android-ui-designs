package com.timzowen.easycoach.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun BookingScreen(navController: NavController){
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Column {
            Row {
                Text(text = "Eldoret")
                Icons.Filled.ArrowBack
                Text(text = "Nairobi")
            }
        }

    }
}

//@Composable
//@Preview(showBackground = true)
//fun BookingScreenPreview(){
//    BookingScreen()
//}