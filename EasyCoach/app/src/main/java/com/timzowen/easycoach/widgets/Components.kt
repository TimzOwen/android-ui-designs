package com.timzowen.easycoach.widgets


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.timzowen.easycoach.R
import com.timzowen.easycoach.model.Bus


@Composable
fun BusCard(
    bus: Bus
) {
    Surface(
        modifier = Modifier
            .padding(6.dp)
            .heightIn(100.dp, 110.dp)
            .fillMaxWidth(),
        tonalElevation = 5.dp,
        shape = RoundedCornerShape(5.dp)
    ) {
        Row {
            Surface(
                modifier = Modifier
                    .size(90.dp)
                    .align(Alignment.CenterVertically)
                    .padding(6.dp),
                shape = RoundedCornerShape(5.dp),
                tonalElevation = 5.dp
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(bus.coachImage)
                        .build(),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Bus Image"
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = bus.coachRouteName)
                Spacer(modifier = Modifier.padding(3.dp))
                Text(text = bus.coachRegNumber)
                Spacer(modifier = Modifier.padding(3.dp))
                Text(text = bus.coachDriver)
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center) {
                Text(text = "Departure: Date")
                Spacer(modifier = Modifier.padding(3.dp))
                Text(text = "Dec 2 - 2024")
                Spacer(modifier = Modifier.padding(3.dp))
                Text(text = "Time: 08:00 hrs")
            }
        }

    }
}

@Composable
fun BookingCard(){
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


@Preview(showBackground = true)
@Composable
fun BookingScreenPreview(){
    BookingCard()
}

@Preview(showBackground = true)
@Composable
fun BusCardPreview() {
    BusCard(
        bus = Bus(
            coachRouteName = "Nairobi - Kitale",
            coachDriver = "John Doe",
            coachRegNumber = "KDN 600L",
            coachImage = "https"
        )
    )
}