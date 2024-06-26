package com.example.aiplanner.presentation.homescreen.news_navigator

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.aiplanner.R
import com.example.aiplanner.presentation.bottomsheet.BottomSheetContent
import com.example.aiplanner.presentation.calendar.CalendarScreen
import com.example.aiplanner.presentation.homescreen.HomeScreen
import com.example.aiplanner.presentation.homescreen.news_navigator.components.AiPlannerBottomNavigation
import com.example.aiplanner.presentation.homescreen.news_navigator.components.BlackFloatingActionButton
import com.example.aiplanner.presentation.homescreen.news_navigator.components.BottomNavigationItem
import com.example.aiplanner.presentation.nvgraph.Route
import com.example.aiplanner.presentation.settings.SettingScreen
import com.example.aiplanner.presentation.themescreen.ThemeScreen
import kotlinx.coroutines.launch

@SuppressLint("RememberReturnType")
@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AiPlannerNavigator() {
    val bottomNavigationItems = remember {
        listOf(
            BottomNavigationItem(
                selectedIcon = R.drawable.tasks,
                unSelectedIcon = R.drawable.taskslight,
                text = "Schedule"
            ),
            BottomNavigationItem(
                selectedIcon = R.drawable.themes,
                unSelectedIcon = R.drawable.themeslight,
                text = "Themes"
            ),
            BottomNavigationItem(
                selectedIcon = R.drawable.calander,
                unSelectedIcon = R.drawable.calendarlight,
                text = "Calendar"
            ),
            BottomNavigationItem(
                selectedIcon = R.drawable.premium,
                unSelectedIcon = R.drawable.premiumlight,
                text = "Premium"
            )
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
    val isFloatingActionButtonVisible = remember(key1 = backstackState) {
        backstackState?.destination?.route == Route.HomeScreen.route
    }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()


    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            //TODO : Drawer Content
            ModalDrawerSheet {

            }
        }
    ) {
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetContent = {
            BottomSheetContent(
                onCrossIconClick = {
                    scope.launch {
                        scaffoldState.bottomSheetState.partialExpand()
                    }
                }
            )
        },
        sheetDragHandle = {

        },
        sheetShape = RoundedCornerShape(topStart = CornerSize(20.dp), topEnd = CornerSize(20.dp), bottomStart = CornerSize(0.dp), bottomEnd = CornerSize(0.dp)),
        sheetPeekHeight = 0.dp,
        sheetShadowElevation = 20.dp,
        sheetSwipeEnabled = false,
        sheetContainerColor = colorResource(id = R.color.system_color_white)
    ) {
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

                },
                floatingActionButton = {
                    if (isFloatingActionButtonVisible) {
                        BlackFloatingActionButton() {
                            scope.launch {
                                scaffoldState.bottomSheetState.expand()
                            }
                        }
                    }
                }
            ) {
                val bottomPadding = it.calculateBottomPadding()
                val statusBarPadding = it.calculateTopPadding()
                NavHost(
                    modifier = Modifier
                        .padding(bottom = bottomPadding)
                        .background(color = colorResource(id = R.color.system_screens_background)),
                    navController = navController,
                    startDestination = Route.HomeScreen.route,
                ) {
                    composable(route = Route.HomeScreen.route) {
                        HomeScreen(
                            statusBarPadding = statusBarPadding,
                            onSideBarIconClick = {
                                scope.launch {
                                    drawerState.open()
                                }
                            }
                        )
                    }
                    composable(route = Route.ThemesScreen.route) {
                        ThemeScreen(
                            statusBarPadding = statusBarPadding
                        )
                    }
                    composable(route = Route.CalendarScreen.route) {
                        CalendarScreen(
                            statusBarPadding = statusBarPadding
                        )
                    }
                    composable(route = Route.SettingScreen.route) {
                        SettingScreen(
                            statusBarPadding = statusBarPadding
                        )
                    }
                }
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