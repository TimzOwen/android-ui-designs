package com.timzowen.easycoach.navigation

import android.view.Menu
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.timzowen.easycoach.screens.BookingScreen
import com.timzowen.easycoach.screens.HelpScreen
import com.timzowen.easycoach.screens.HomeScreen
import com.timzowen.easycoach.screens.MenuScreen
import com.timzowen.easycoach.screens.ParcelScreen

@Composable
fun EasyCoachNavigation(){
    val navController = rememberNavController()
    NavHost(navController =navController, startDestination = NavigationScreens.HomeScreen.name ) {
        composable(route = NavigationScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }
        composable(route = NavigationScreens.ParcelsScreen.name){
            ParcelScreen(navController = navController)
        }
        composable(route = NavigationScreens.BookingsScreen.name){
            BookingScreen(navController = navController)
        }
        composable(route = NavigationScreens.MenuScreen.name){
            MenuScreen(navController = navController)
        }
        composable(route = NavigationScreens.HelpScreen.name){
            HelpScreen(navController = navController)
        }
    }
}