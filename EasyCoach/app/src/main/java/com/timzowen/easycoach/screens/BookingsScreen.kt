package com.timzowen.easycoach.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.timzowen.easycoach.R

@Composable
fun BookingScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Column {
                Row(modifier = Modifier.fillMaxWidth()
                    .padding(top = 4.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly) {
                    Text(text = "Eldoret")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "arrow forward",
                        modifier = Modifier.size(15.dp))
                    Text(text = "Nairobi")
                }
                Row(modifier = Modifier.fillMaxWidth()
                    .padding(top = 6.dp, bottom = 4.dp)) {
                    Box(modifier =Modifier
                        .size(80.dp)
                        .padding(start = 6.dp)
                        .clip(RoundedCornerShape(5.dp))) {
                        Image(
                            painter = painterResource(id = R.drawable.easycoach),
                            contentScale = ContentScale.Crop,
                            contentDescription = "null")
                    }
                    Column(modifier = Modifier
                        .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center) {
                        Text(text = "Booking Id: 12345678")
                        Text(text = "Departure time: 22:00:00",
                            modifier = Modifier.padding(top = 6.dp, bottom = 6.dp))
                        Text(text = "Travel date: 15 - Jan - 2025")
                    }
                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun BookingScreenPreview(){
    BookingScreen()
}