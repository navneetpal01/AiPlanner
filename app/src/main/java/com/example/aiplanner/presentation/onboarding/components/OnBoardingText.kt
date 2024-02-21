package com.example.aiplanner.presentation.onboarding.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_light
import com.example.aiplanner.ui.theme.ridley_grotesk_semibold

@Composable
fun OnBoardingText(
    modifier: Modifier = Modifier,
    page : Page
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier
                .padding(bottom = 10.dp),
            text = page.content,
            fontSize = 28.sp,
            fontFamily = ridley_grotesk_semibold,
            lineHeight = 35.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            color = colorResource(id = R.color.element_onboarding_text_first_color),
        )
        Text(
            modifier = Modifier
                .padding(bottom = 10.dp, end = 60.dp),
            text = page.description,
            fontSize = 13.sp,
            fontFamily = ridley_grotesk_light,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.element_onboarding_text_second_color)
        )
    }
}
