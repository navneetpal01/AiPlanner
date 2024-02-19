package com.example.aiplanner.presentation.onboarding.components.onboardingphone

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import com.example.aiplanner.ui.theme.System_Black

@Composable
fun OnBoardingPhoneFrame(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxHeight(0.6f)
            .fillMaxWidth()
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
        ) {
            val frameHeight = size.height
            val frameWidth = size.width
            val frameStartHorizontalSpace = 125f
            val frameEndHorizontalSpace = frameWidth - frameStartHorizontalSpace
            drawLine(
                color = Color.Black,
                start = Offset(frameStartHorizontalSpace, 250f),
                end = Offset(frameStartHorizontalSpace, frameHeight),
                strokeWidth = 30f,
                alpha = 1f,
            )
            drawLine(
                color = Color.Black,
                start = Offset(frameEndHorizontalSpace, 250f),
                end = Offset(frameEndHorizontalSpace, frameHeight),
                strokeWidth = 30f,
                alpha = 1f,
                )
        }
    }
}