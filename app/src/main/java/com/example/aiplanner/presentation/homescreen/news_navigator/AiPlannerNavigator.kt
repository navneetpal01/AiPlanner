package com.example.aiplanner.presentation.homescreen.news_navigator

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.aiplanner.R
import com.example.aiplanner.presentation.calendar.CalendarScreen
import com.example.aiplanner.presentation.homescreen.HomeScreen
import com.example.aiplanner.presentation.homescreen.news_navigator.components.AiPlannerBottomNavigation
import com.example.aiplanner.presentation.homescreen.news_navigator.components.BottomNavigationItem
import com.example.aiplanner.presentation.nvgraph.Route
import com.example.aiplanner.presentation.settings.SettingScreen
import com.example.aiplanner.presentation.themescreen.ThemeScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AiPlannerNavigator() {
    val bottomNavigationItems = remember {
        listOf(
            BottomNavigationItem(selectedIcon = R.drawable.tasks, unSelectedIcon = R.drawable.taskslight, text = "Schedule"),
            BottomNavigationItem(selectedIcon = R.drawable.themes, unSelectedIcon = R.drawable.themeslight, text = "Themes"),
            BottomNavigationItem(selectedIcon = R.drawable.calander, unSelectedIcon = R.drawable.calendarlight, text = "Calendar"),
            BottomNavigationItem(selectedIcon = R.drawable.settings, unSelectedIcon = R.drawable.settingslight, text = "Setting")
        )
    }
    val navController = rememberNavController()
    val backstackState = navController.currentBackStackEntryAsState().value
    var selectedItem by rememberSaveable {
        mutableStateOf(0)
    }

    selectedItem = remember(key1 = backstackState) {
        when (backstackState?.destination?.route) {
            Route.HomeScreen.route -> 0
            Route.ThemesScreen.route -> 1
            Route.CalendarScreen.route -> 2
            Route.SettingScreen.route -> 3
            else -> 0
        }
    }
    /*
    val isBottomBarVisible = remember(key1 = backstackState) {
        backstackState?.destination?.route == Route.HomeScreen.route ||
                backstackState?.destination?.route == Route.ThemesScreen.route ||
                backstackState?.destination?.route== Route.CalendarScreen.route ||
                backstackState?.destination?.route == Route.SettingScreen.route
    }
     */
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        bottomBar = {
            AiPlannerBottomNavigation(
                items = bottomNavigationItems,
                selected = selectedItem,
                onItemClick = { index ->
                    when (index) {
                        0 -> navigateToTab(
                            navController = navController,
                            route = Route.HomeScreen.route
                        )

                        1 -> navigateToTab(
                            navController = navController,
                            route = Route.ThemesScreen.route
                        )

                        2 -> navigateToTab(
                            navController = navController,
                            route = Route.CalendarScreen.route
                        )

                        3 -> navigateToTab(
                            navController = navController,
                            route = Route.SettingScreen.route
                        )
                    }
                }
            )

        }
    ) {
        val bottomPadding = it.calculateBottomPadding()
        NavHost(
            modifier = Modifier
                .padding(bottom = bottomPadding)
                .background(color = colorResource(id = R.color.system_screens_background)),
            navController = navController,
            startDestination = Route.HomeScreen.route,
        ) {
            composable(route = Route.HomeScreen.route) {
                HomeScreen()
            }
            composable(route = Route.ThemesScreen.route) {
                ThemeScreen()
            }
            composable(route = Route.CalendarScreen.route) {
                CalendarScreen()
            }
            composable(route = Route.SettingScreen.route) {
                SettingScreen()
            }
        }
    }
}

private fun navigateToTab(navController: NavController, route: String) {
    navController.navigate(route) {
        navController.graph.startDestinationRoute?.let { homeScreen ->
            popUpTo(homeScreen) {
                saveState = true
            }
            restoreState = true
            launchSingleTop = true
        }
    }
}