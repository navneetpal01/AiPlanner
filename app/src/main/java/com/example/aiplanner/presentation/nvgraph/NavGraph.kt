package com.example.aiplanner.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aiplanner.presentation.HomeScreen.HomeScreen
import com.example.aiplanner.presentation.onboarding.OnBoardingScreen

@Composable
fun NavGraph(
    startDestination : String
){
    val navController = rememberNavController()
    NavHost(navController = navController,startDestination = startDestination){
        composable(route = "OnBoardingScreen"){
            OnBoardingScreen()
        }
        composable(route = "HomeScreen"){
            HomeScreen()
        }
    }
}