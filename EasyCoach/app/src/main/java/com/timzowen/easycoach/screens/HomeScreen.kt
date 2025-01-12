package com.timzowen.easycoach.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.timzowen.easycoach.model.Bus
import com.timzowen.easycoach.model.loadBuses
import com.timzowen.easycoach.navigation.NavigationScreens
import com.timzowen.easycoach.ui.theme.EasyCoachTheme
import com.timzowen.easycoach.widgets.BusCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val context = LocalContext.current
    EasyCoachTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Easy Coach")
                            Surface(modifier = Modifier
                                .padding(end = 6.dp)
                                .clip(RoundedCornerShape(5.dp))) {
                                Icon(imageVector = Icons.Filled.AccountCircle,
                                    contentDescription = "share")
                            }
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFC03B28))
                )
            },
            bottomBar = {
                BottomAppBar(containerColor = Color(0xFFAA2715)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        BottomNavIcons(
                            icon = Icons.Default.Home,
                            label = "Home",
                            onclick = {
                                navController.navigate(NavigationScreens.HomeScreen.name)
                            })
                        BottomNavIcons(
                            icon = Icons.Default.LocationOn,
                            label = "Bookings",
                            onclick = {
                                navController.navigate(NavigationScreens.BookingsScreen.name)
                            })
                        BottomNavIcons(
                            icon = Icons.Default.Menu,
                            label = "Menu",
                            onclick = {
                                navController.navigate(NavigationScreens.MenuScreen.name)
                            })
                        BottomNavIcons(
                            icon = Icons.Default.ShoppingCart,
                            label = "Parcels",
                            onclick = {
                                navController.navigate(NavigationScreens.ParcelsScreen.name)
                            })
                        BottomNavIcons(
                            icon = Icons.Default.Search,
                            label = "Help",
                            onclick = {
                                navController.navigate(NavigationScreens.HelpScreen.name)
                            })
                    }
                }
            },
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Surface(modifier = Modifier.padding(innerPadding)) {
                BusViewList()
            }
        }
    }
}

@Composable
fun BusViewList(bus: List<Bus> = loadBuses()){
    LazyColumn {
        items(items = bus){ bus ->
            BusCard(bus = bus)
        }
    }
}

@Composable
fun BottomNavIcons(icon: ImageVector, label: String, onclick: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable {
            onclick()
        }) {
        Icon(
            imageVector = icon,
            contentDescription = label
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            style = TextStyle(
                fontSize = 12.sp,
                color = Color.White
            )
        )

    }
}

@Composable
@Preview(showBackground = true)
fun HomeMainAppPreview() {
    val mockScreenNav = rememberNavController()
    HomeScreen(navController = mockScreenNav)
}