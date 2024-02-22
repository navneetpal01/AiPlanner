package com.example.aiplanner.presentation.nvgraph

sealed class Route(
    val route : String
){
    object AppStartNavigation : Route(route = "AppStartNavigation")
    object AiPlannerNavigation : Route(route = "AiPlannerNavigation")
    object OnBoardingScreen : Route(route = "OnBoardingScreen")
    object HomeScreen : Route(route = "HomeScreen")
}