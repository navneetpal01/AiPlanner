package com.example.aiplanner.presentation.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.onboarding.components.OnBoardingText
import com.example.aiplanner.presentation.onboarding.components.PageIndicator

@Composable
fun OnBoardingScreen(){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .navigationBarsPadding()
            .background(color = colorResource(id = R.color.system_color_white))
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            PageIndicator(
                modifier = Modifier
                    .padding(top = 40.dp, start = 15.dp),
                pageSize = 3,
                selectedPage = 0
            )
            OnBoardingText()

        }
    }
}