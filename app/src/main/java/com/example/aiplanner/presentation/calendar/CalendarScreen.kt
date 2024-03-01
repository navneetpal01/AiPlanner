package com.example.aiplanner.presentation.calendar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aiplanner.task.TaskViewModel

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun CalendarScreen() {
    val taskViewModel: TaskViewModel = viewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }
}