package com.example.aiplanner.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aiplanner.domain.usecases.app_entry.AppEntryUseCases
import com.example.aiplanner.presentation.onboarding.components.OnBoardingEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
) : ViewModel() {
    fun onEvent(event: OnBoardingEvent){
        when(event){
            is OnBoardingEvent.SavedAppEntry -> {
                saveAppEntry()
            }
        }
    }
    private fun saveAppEntry(){
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry()
        }
    }
}