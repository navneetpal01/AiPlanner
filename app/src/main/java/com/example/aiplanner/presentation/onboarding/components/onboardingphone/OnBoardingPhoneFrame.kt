package com.example.aiplanner.presentation.onboarding.components.onboardingphone

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import com.example.aiplanner.ui.theme.First_Frame
import com.example.aiplanner.ui.theme.Second_Frame
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
            //ThirdFrame
            val frameHeight = size.height
            val frameWidth = size.width
            val thirdLeftFrame = 150f
            val thirdRightFrame = frameWidth - thirdLeftFrame
            val thirdPath = Path()
            thirdPath.moveTo(x = thirdLeftFrame,y = frameHeight)
            thirdPath.lineTo(x = thirdLeftFrame,y = 250f)
            thirdPath.cubicTo(
                x1 = thirdLeftFrame,y1 = 160f,
                x2 = thirdLeftFrame + 50f,y2 = 100f,
                x3 = thirdLeftFrame + 150,y3 = 100f
            )
            thirdPath.lineTo(x = thirdRightFrame - 150f,y = 100f)
            thirdPath.moveTo(x = thirdRightFrame, y = frameHeight)
            thirdPath.lineTo(x = thirdRightFrame,y = 250f)
            thirdPath.cubicTo(
                x1 = thirdRightFrame, y1 = 160f,
                x2 = thirdRightFrame - 50f, y2 = 100f,
                x3 = thirdRightFrame - 150f, y3 = 100f
            )
            drawPath(path = thirdPath, color = System_Black, style = Stroke(width = 35f))
            //SecondFrame -15
            val secondLeftFrame = 135f
            val secondRightFrame = frameWidth - secondLeftFrame
            val secondPath = Path()
            secondPath.moveTo(x = secondLeftFrame,y = frameHeight)
            secondPath.lineTo(x = secondLeftFrame,y = 250f)
            secondPath.cubicTo(
                x1 = secondLeftFrame,y1 = 145f,
                x2 = secondLeftFrame + 50f,y2 = 85f,
                x3 = secondLeftFrame + 150,y3 = 85f
            )
            secondPath.lineTo(x = secondRightFrame - 150f,y = 85f)
            secondPath.moveTo(x = secondRightFrame, y = frameHeight)
            secondPath.lineTo(x = secondRightFrame,y = 250f)
            secondPath.cubicTo(
                x1 = secondRightFrame, y1 = 145f,
                x2 = secondRightFrame - 50f, y2 = 85f,
                x3 = secondRightFrame - 150f, y3 = 85f
            )
            drawPath(path = secondPath, color = Second_Frame, style = Stroke(width = 5f))
            //FirstFrame - 9
            val firstLeftFrame = 126f
            val firstRightFrame = frameWidth - firstLeftFrame
            val firstPath = Path()
            firstPath.moveTo(x = firstLeftFrame,y = frameHeight)
            firstPath.lineTo(x = firstLeftFrame,y = 250f)
            firstPath.cubicTo(
                x1 = firstLeftFrame,y1 = 136f,
                x2 = firstLeftFrame + 50f,y2 = 76f,
                x3 = firstLeftFrame + 150,y3 = 76f
            )
            firstPath.lineTo(x = firstRightFrame - 150f,y = 76f)
            firstPath.moveTo(x = firstRightFrame, y = frameHeight)
            firstPath.lineTo(x = firstRightFrame,y = 250f)
            firstPath.cubicTo(
                x1 = firstRightFrame, y1 = 136f,
                x2 = firstRightFrame - 50f, y2 = 76f,
                x3 = firstRightFrame - 150f, y3 = 76f
            )
            drawPath(path = firstPath, color = First_Frame, style = Stroke(width = 5f))



        }
    }
}