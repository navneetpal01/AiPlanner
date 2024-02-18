package com.example.aiplanner.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R

@Composable
fun PageIndicator(
    modifier : Modifier = Modifier,
    pageSize : Int,
    selectedPage : Int,
    selectedColor : Color = colorResource(id = R.color.system_color_blue),
    unselectedColor : Color = colorResource(id = R.color.element_indicator_color),
    selectedIndicatorWidth : Dp = 50.dp,
    unselectedIndicatorWidth : Dp = 15.dp
    ){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Start
    ){
        repeat(times = pageSize){page ->
            Box(
                modifier = Modifier
                    .height(height = 5.dp)
                    .width(width = if (page == selectedPage) selectedIndicatorWidth else unselectedIndicatorWidth)
                    .padding(horizontal = 2.dp)
                    .background(color = if (page == selectedPage) selectedColor else unselectedColor)
            )
        }
    }
}