package com.example.aiplanner

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.example.aiplanner.presentation.nvgraph.NavGraph
import com.example.aiplanner.ui.theme.AiPlannerTheme
import com.example.aiplanner.ui.theme.System_ScreenColor
import com.example.aiplanner.ui.theme.rememberWindowSizeClass
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val viewModel by viewModels<MainViewModel>()
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition(){
                viewModel.splashCondition
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window,false)
        setContent {
            val windowSize = rememberWindowSizeClass()
            AiPlannerTheme(windowSizeClass = windowSize, darkTheme = false){
                val systemUiController = rememberSystemUiController()
                val isSystemInDarkMode = isSystemInDarkTheme()
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = System_ScreenColor
                    )
                    systemUiController.setNavigationBarColor(
                        color = Color.Black
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .navigationBarsPadding()
                        .background(color = MaterialTheme.colorScheme.onSurface),
                ){
                    val startDestination = viewModel.startDestination
                    NavGraph(startDestination = startDestination)
                }
            }
        }
    }
}
