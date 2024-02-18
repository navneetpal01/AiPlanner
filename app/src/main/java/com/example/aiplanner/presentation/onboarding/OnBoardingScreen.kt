package com.example.aiplanner.presentation.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.onboarding.components.OnBoardingButton
import com.example.aiplanner.presentation.onboarding.components.OnBoardingText
import com.example.aiplanner.presentation.onboarding.components.PageIndicator

@Composable
fun OnBoardingScreen() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .navigationBarsPadding()
            .background(color = colorResource(id = R.color.system_color_white))
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        ) {
            PageIndicator(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 40.dp, start = 15.dp),
                pageSize = 3,
                selectedPage = 0
            )
            OnBoardingText(
                modifier = Modifier
                    .align(Alignment.Center)
            )
            OnBoardingButton(
                modifier = Modifier
                    .padding(start = 15.dp)
                    .align(Alignment.BottomStart),
                buttonText = "Next ->"
            ){

            }
        }
        Box(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {

        }
    }
}