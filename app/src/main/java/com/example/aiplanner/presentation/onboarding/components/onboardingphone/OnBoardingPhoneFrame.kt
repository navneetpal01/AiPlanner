package com.example.aiplanner.presentation.onboarding.components.onboardingphone

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import com.example.aiplanner.ui.theme.Camera_First_Frame
import com.example.aiplanner.ui.theme.Camera_Second_Frame
import com.example.aiplanner.ui.theme.Camera_Third_Frame
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
            //Third frame
            val thirdLeftFrame = frameWidth * 0.1389f
            val thirdRightFrame = frameWidth - thirdLeftFrame
            val thirdPath = Path()
            thirdPath.moveTo(x = thirdLeftFrame, y = frameHeight)
            thirdPath.lineTo(x = thirdLeftFrame, y = frameHeight * 0.185f)
            thirdPath.cubicTo(
                x1 = thirdLeftFrame, y1 = frameHeight*0.118f,
                x2 = thirdLeftFrame + frameWidth * 0.046f, y2 = frameHeight*0.074f,
                x3 = thirdLeftFrame + frameWidth*0.139f, y3 = frameHeight*0.074f
            )
            thirdPath.lineTo(x = thirdRightFrame - frameWidth*0.139f, y = frameHeight*0.074f)
            thirdPath.moveTo(x = thirdRightFrame, y = frameHeight)
            thirdPath.lineTo(x = thirdRightFrame, y = frameHeight*0.185f)
            thirdPath.cubicTo(
                x1 = thirdRightFrame, y1 = frameHeight*0.118f,
                x2 = thirdRightFrame - frameWidth*0.046f, y2 = frameHeight*0.074f,
                x3 = thirdRightFrame - frameWidth*0.139f, y3 = frameHeight*0.074f
            )
            drawPath(path = thirdPath, color = System_Black, style = Stroke(width = frameWidth*0.032f)) //35f
            //SecondFrame -15
            val secondLeftFrame = frameWidth*0.125f
            val secondRightFrame = frameWidth - secondLeftFrame
            val secondPath = Path()
            secondPath.moveTo(x = secondLeftFrame, y = frameHeight)
            secondPath.lineTo(x = secondLeftFrame, y = frameHeight*0.185f)
            secondPath.cubicTo(
                x1 = secondLeftFrame, y1 = frameHeight*0.107f,
                x2 = secondLeftFrame + frameWidth*0.046f, y2 = frameHeight*0.063f,
                x3 = secondLeftFrame + frameWidth*0.139f, y3 = frameHeight*0.063f
            )
            secondPath.lineTo(x = secondRightFrame - frameWidth*0.139f, y = frameHeight*0.063f)
            secondPath.moveTo(x = secondRightFrame, y = frameHeight)
            secondPath.lineTo(x = secondRightFrame, y = frameHeight*0.185f)
            secondPath.cubicTo(
                x1 = secondRightFrame, y1 = frameHeight*0.107f,
                x2 = secondRightFrame - frameWidth*0.046f, y2 = frameHeight*0.063f,
                x3 = secondRightFrame - frameWidth*0.139f, y3 = frameHeight*0.063f
            )
            drawPath(path = secondPath, color = Second_Frame, style = Stroke(width = frameWidth*0.005f))
            //FirstFrame - 9
            val firstLeftFrame = frameWidth*0.117f
            val firstRightFrame = frameWidth - firstLeftFrame
            val firstPath = Path()
            firstPath.moveTo(x = firstLeftFrame, y = frameHeight)
            firstPath.lineTo(x = firstLeftFrame, y = frameHeight*0.185f)
            firstPath.cubicTo(
                x1 = firstLeftFrame, y1 = frameHeight*0.10059f,
                x2 = firstLeftFrame + frameWidth*0.046f, y2 = frameHeight*0.056f,
                x3 = firstLeftFrame + frameWidth*0.139f, y3 = frameHeight*0.056f
            )
            firstPath.lineTo(x = firstRightFrame - frameWidth*0.139f, y = frameHeight*0.056f)
            firstPath.moveTo(x = firstRightFrame, y = frameHeight)
            firstPath.lineTo(x = firstRightFrame, y = frameHeight*0.185f)
            firstPath.cubicTo(
                x1 = firstRightFrame, y1 = frameHeight*0.10059f,
                x2 = firstRightFrame - frameWidth*0.046f, y2 = frameHeight*0.056f,
                x3 = firstRightFrame - frameWidth*0.139f, y3 = frameHeight*0.056f
            )
            //Buttons
            firstPath.moveTo(
                x = firstRightFrame,
                y = frameHeight*0.296f
            )
            firstPath.addRoundRect(
                roundRect = RoundRect(
                    left = frameWidth*0.111f,
                    top = frameHeight*0.296f,
                    right = frameWidth*0.117f,
                    bottom = frameHeight*0.392f,
                    cornerRadius = CornerRadius(
                        x = frameWidth*0.005f,
                        y = frameHeight*0.004f,
                    )
                )
            )
            firstPath.moveTo(
                x = firstRightFrame,
                y = frameHeight*0.444f
            )
            firstPath.addRoundRect(
                roundRect = RoundRect(
                    left = firstRightFrame,
                    top = frameHeight*0.37f,
                    right = firstRightFrame + frameWidth*0.005f,
                    bottom = frameHeight*0.54f,
                    cornerRadius = CornerRadius(
                        x = frameWidth*0.005f,
                        y = frameHeight*0.004f,
                    )
                )
            )
            drawPath(path = firstPath, color = First_Frame, style = Stroke(width = frameWidth*0.005f))
            //Notch
            val notchWidth = frameWidth*0.231f
            val notchAtX = (frameWidth / 2) - (notchWidth / 2)
            drawRoundRect(
                color = System_Black,
                topLeft = Offset(
                    x = notchAtX,
                    y = frameHeight*0.1035f
                ),
                size = Size(
                    width = notchWidth,
                    height = frameHeight*0.052f
                ),
                cornerRadius = CornerRadius(x = frameWidth*0.065f, y = frameHeight*0.052f)
            )
            //Camera
            drawCircle(
                color = Camera_First_Frame,
                radius = frameWidth*0.017f,
                center = Offset(
                    x = frameWidth*0.569f,
                    y = frameHeight*0.129f
                )
            )
            drawCircle(
                color = Camera_Second_Frame,
                radius = frameWidth*0.007f,
                center = Offset(
                    x = frameWidth*0.569f,
                    y = frameHeight*0.129f
                )
            )
            drawCircle(
                color = Camera_Third_Frame,
                radius = frameWidth*0.003f,
                center = Offset(
                    x = frameWidth*0.569f,
                    y = frameHeight*0.129f
                )
            )
        }
    }
}