package com.example.aiplanner.presentation.nvgraph

sealed class Route(
    val route : String
){
    object AppStartNavigation : Route(route = "AppStartNavigation")
    object AiPlannerNavigation : Route(route = "AiPlannerNavigation")
    object OnBoardingScreen : Route(route = "OnBoardingScreen")
    object AiPlannerNavigator : Route(route = "AiPlannerNavigatorScreen")
    object HomeScreen : Route(route = "HomeScreen")
    object ThemesScreen : Route(route = "SearchScreen")
    object CalendarScreen : Route(route = "CalendarScreen")
    object SettingScreen : Route(route = "SettingScreen")
}