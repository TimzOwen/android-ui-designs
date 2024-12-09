package com.timzowen.easycoach.navigation

enum class NavigationScreens{
    HomeScreen,
    MenuScreen,
    HelpScreen,
    ParcelsScreen,
    BookingsScreen;

    companion object{
        fun AppFromRoute(route: String?) : NavigationScreens =
            when(route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                MenuScreen.name -> MenuScreen
                ParcelsScreen.name -> ParcelsScreen
                BookingsScreen.name -> BookingsScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("$route not found")
            }
    }
}