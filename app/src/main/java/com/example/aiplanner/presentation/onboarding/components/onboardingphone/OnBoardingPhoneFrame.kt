package com.example.aiplanner.presentation.onboarding.components.onboardingphone

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke

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
            val leftWidthBlackFrame = 150f
            val rightWidthBlackFrame = frameWidth - leftWidthBlackFrame
            val path = Path()
            path.moveTo(x = leftWidthBlackFrame,y = frameHeight)
            path.lineTo(x = leftWidthBlackFrame,y = 250f)
            /*
            path.cubicTo(
                x1 = leftWidthBlackFrame,y1 = 200f,
                x2 = 200f,y2 = 100f,
                x3 = 300f,y3= 100f
            )
             */
            path.cubicTo(
                x1 = leftWidthBlackFrame,y1 = 160f,
                x2 = leftWidthBlackFrame + 50f,y2 = 100f,
                x3 = leftWidthBlackFrame + 150,y3 = 100f
            )
            path.lineTo(x = rightWidthBlackFrame - 150f,y = 100f)
            path.moveTo(x = rightWidthBlackFrame, y = frameHeight)
            path.lineTo(x = rightWidthBlackFrame,y = 250f)
            path.cubicTo(
                x1 = rightWidthBlackFrame, y1 = 160f,
                x2 = rightWidthBlackFrame - 50f, y2 = 100f,
                x3 = rightWidthBlackFrame - 150f, y3 = 100f
            )
            drawPath(path = path, color = Color.Black, style = Stroke(width = 35f))


        }
    }
}