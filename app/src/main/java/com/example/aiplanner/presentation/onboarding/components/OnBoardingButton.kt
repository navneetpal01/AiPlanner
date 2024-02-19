package com.example.aiplanner.presentation.onboarding.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_medium

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
        Row(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = buttonText,
                fontSize = 20.sp,
                fontFamily = ridley_grotesk_medium,
                color = colorResource(id = R.color.system_color_white)
            )
            Icon(
                modifier = Modifier
                    .padding(start = 1.dp),
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "ArrowForward",
                tint = colorResource(id = R.color.system_color_white)
            )
        }
    }
}