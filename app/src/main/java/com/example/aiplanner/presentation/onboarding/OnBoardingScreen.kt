package com.example.aiplanner.presentation.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.onboarding.components.OnBoardingButton
import com.example.aiplanner.presentation.onboarding.components.OnBoardingText
import com.example.aiplanner.presentation.onboarding.components.PageIndicator
import com.example.aiplanner.presentation.onboarding.components.onboardingphone.OnBoardingPhoneFrame

@Composable
fun OnBoardingScreen() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.system_color_white))
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.4f)
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        ) {
            PageIndicator(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 30.dp, start = 15.dp),
                pageSize = 3,
                selectedPage = 0
            )
            OnBoardingText(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 10.dp)
                    .align(Alignment.Center)
            )
            OnBoardingButton(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(Alignment.BottomStart),
                buttonText = "Next"
            ){

            }
        }
        OnBoardingPhoneFrame(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )
    }
}