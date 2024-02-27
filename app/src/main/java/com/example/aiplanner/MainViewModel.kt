package com.example.aiplanner

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aiplanner.domain.usecases.app_entry.AppEntryUseCases
import com.example.aiplanner.presentation.nvgraph.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
): ViewModel(){
    var splashCondition by mutableStateOf(true)
        private set
    var startDestination by mutableStateOf(Route.AppStartNavigation.route)
        private set
    init {
        appEntryUseCases.readAppEntry().onEach {shouldStartFromHomeScreen ->
            if(shouldStartFromHomeScreen){
                startDestination = Route.AiPlannerNavigation.route
            }else{
                startDestination = Route.AppStartNavigation.route
            }
            delay(500)
            splashCondition = false
        }.launchIn(viewModelScope)
    }
}