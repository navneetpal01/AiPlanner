package com.example.aiplanner.presentation.nvgraph

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.aiplanner.presentation.homescreen.news_navigator.AiPlannerNavigator
import com.example.aiplanner.presentation.onboarding.OnBoardingScreen
import com.example.aiplanner.presentation.onboarding.OnBoardingViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(
    startDestination : String
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination
    ){
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(route = Route.OnBoardingScreen.route){
                val viewModel : OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(){
                    viewModel.onEvent(it)
                }
            }
        }
        navigation(
            route = Route.AiPlannerNavigation.route,
            startDestination = Route.AiPlannerNavigator.route
        ){
            composable(route = Route.AiPlannerNavigator.route){
                AiPlannerNavigator()
            }
        }
    }
}