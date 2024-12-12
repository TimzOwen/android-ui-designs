package com.timzowen.realestate254.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.realestate254.viewmodel.PropertyViewModel
import com.timzowen.realestate254.widgets.PropertyCard
import com.timzowen.realestate254.widgets.PropertyCardRow
import com.timzowen.realestate254.widgets.SearchAndFilter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PropertyHomeScreen(viewModel: PropertyViewModel){

    val recommendedProperties by viewModel.recommendedProperty.collectAsState()
    val nearbyProperties by viewModel.nearbyProperties.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Property Estate")})
        }
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .padding(16.dp)) {

            SearchAndFilter()

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Recommended Property", fontWeight = FontWeight.Bold, fontSize = 18.sp)

            LazyRow {
                items(recommendedProperties.size){ index ->
                    PropertyCard(property = recommendedProperties[index])
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Recommended Property", fontWeight = FontWeight.Bold, fontSize = 18.sp)

            LazyColumn {
                items(nearbyProperties.size){
                    PropertyCardRow(property = nearbyProperties[it])
                }
            }
        }
        
    }
}
