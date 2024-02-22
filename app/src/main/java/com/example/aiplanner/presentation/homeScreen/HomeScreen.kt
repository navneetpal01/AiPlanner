package com.example.aiplanner.presentation.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.system_color_white))
    ) {
        Text(
            modifier = Modifier
                .fillMaxSize(),
            text = "Welcome",
            color = colorResource(id = R.color.system_color_black),
            fontSize = 100.sp,
            fontWeight = FontWeight.Bold
        )
    }
}