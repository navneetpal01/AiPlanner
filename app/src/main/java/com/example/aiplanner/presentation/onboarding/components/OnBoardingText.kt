package com.example.aiplanner.presentation.onboarding.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_bold
import com.example.aiplanner.ui.theme.ridley_grotesk_semibold

@Composable
fun OnBoardingText(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ){
        Text(
            text = "Manage your Task\n& Projects Easily",
            color = colorResource(id = R.color.element_text_color),
            fontFamily = ridley_grotesk_semibold,
            fontSize = 30.sp
        )


    }

}