package com.timzowen.realestate254.widgets

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.realestate254.R
import com.timzowen.realestate254.model.Property

@Composable
fun PropertyCard(property: Property){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Surface(modifier = Modifier
                .height(120.dp)
                .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.image_realestate),
                    contentDescription = "house",
                    contentScale = ContentScale.Crop)
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp)) {
                Text(text = property.propertyType, fontSize = 12.sp,
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.weight(1f),
                    color = MaterialTheme.colorScheme.primary)
                androidx.compose.material3.
                Icon(imageVector = Icons.Default.Star,
                    contentDescription = "Rating",
                    tint = Color(0xFFFFC107),
                    modifier = Modifier.size(14.dp)
                )
                Text(text = "${property.propertyRating}", fontSize = 8.sp)
                Spacer(modifier = Modifier.width(4.dp))

            }
            PropertyInfoCard(property = property)
        }
    }
}

@Composable
fun PropertyCardRow(property: Property){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row {
            Surface(modifier = Modifier
                .size(70.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.image_realestate),
                    contentDescription = "house",
                    contentScale = ContentScale.Crop)
            }
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 4.dp, end = 4.dp)
                ) {
                    Text(
                        text = property.propertyType, fontSize = 12.sp,
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.weight(1f),
                        color = MaterialTheme.colorScheme.primary
                    )
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Rating",
                        tint = Color(0xFFFFC107),
                        modifier = Modifier.size(14.dp)
                    )
                    Text(text = "${property.propertyRating}", fontSize = 8.sp)
                    Spacer(modifier = Modifier.width(4.dp))
                }
                PropertyInfoCard(property = property)
            }
        }
    }
}


@Composable
fun PropertyInfoCard(property: Property){
    Column(modifier = Modifier.padding(bottom = 4.dp, end = 4.dp, start = 4.dp)) {
        Text(text = property.propertyName,
            style = MaterialTheme.typography.titleMedium,
            maxLines = 1,
            fontWeight = FontWeight.Bold)
        Text(
            text = property.propertyLocation,
            style = MaterialTheme.typography.bodySmall,
            fontSize = 12.sp,
            color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = property.propertyPrice ,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary)
    }
}



@Composable
fun searchLocation(){

}
@Composable
fun SearchAndFilter() {
    var currentSearch by remember { mutableStateOf("") }
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            value = currentSearch,
            onValueChange = {
                currentSearch = it
            },
            modifier = Modifier.weight(1f),
            placeholder = { Text("Search") }
        )
        IconButton(onClick = { /* Open Filters */ }) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Filled.Search ,
                contentDescription = "Filter" )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PropertyCardPreview(){
    PropertyCard(property =
    Property(2, "Home", "Oakleaf Cottage",
        "New York, USA", "$900/month", 4.0,
        ""))
}

@Preview(showBackground = true)
@Composable
fun PropertyCardPreviewRow(){
    PropertyCardRow(property =
    Property(2, "Home", "Oakleaf Cottage",
        "New York, USA", "$900/month", 4.0,
        ""))

}