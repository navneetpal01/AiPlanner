package com.example.aiplanner.presentation.onboarding.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R

@Composable
fun OnBoardingButton(
    modifier: Modifier = Modifier,
    buttonText : String,
    onClick : () -> Unit
){
    Card(
        modifier = modifier
            .clickable { onClick() }
        ,
        shape = RectangleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.element_onboarding_button))
    ){
        Text(
            modifier = Modifier
                .padding(18.dp),
            text = buttonText,
            fontSize = 20.sp,
            color = colorResource(id = R.color.system_color_white)
        )
    }
}