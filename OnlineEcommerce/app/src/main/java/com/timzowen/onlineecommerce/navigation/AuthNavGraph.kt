package com.timzowen.onlineecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.timzowen.onlineecommerce.screens.OnboardingScreen
import com.timzowen.onlineecommerce.viewmodel.AuthViewModel

@Composable
fun AuthNavGraph(navController: NavHostController, viewModel: AuthViewModel){
    NavHost(navController = navController, startDestination = "onboarding") {
        composable("onboarding"){ OnboardingScreen(navController = navController)}
    }
}