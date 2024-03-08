package com.example.aiplanner.presentation.homescreen.news_navigator.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R

@Composable
fun BlackFloatingActionButton(
    modifier: Modifier = Modifier,
    onClick : () -> Unit
) {
    FloatingActionButton(
        modifier = modifier
            .size(65.dp),
        onClick = {
            onClick()
        },
        shape = CircleShape,
        containerColor = colorResource(id = R.color.element_floatingActionButton)
    ){
        Icon(
            modifier = Modifier
                .size(25.dp),
            painter = painterResource(id = R.drawable.add),
            contentDescription = null,
            tint = colorResource(id = R.color.system_color_white)
        )
    }
}