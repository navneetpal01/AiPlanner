package com.example.aiplanner.presentation.settings.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R


@Composable
 fun OpenAiProfile(
    modifier: Modifier = Modifier,
    isVerified: Boolean
 ){
    Box(
        modifier = modifier
            .size(70.dp)
            .clip(CircleShape)
            .background(color = if (isVerified) colorResource(id = R.color.element_verified) else colorResource(id = R.color.element_unverified)),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(color = colorResource(id = R.color.element_openai_background)),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                modifier = Modifier
                    .size(40.dp),
                painter = painterResource(id = R.drawable.openai),
                contentDescription = null,
                tint = colorResource(id = R.color.system_color_white)
            )
        }
    }
}