package com.example.aiplanner.presentation.nvgraph

sealed class Route(
    val route : String
){
    object OnBoardingScreen : Route(route = "OnBoardingScreen")
    object HomeScreen : Route(route = "HomeScreen")
}