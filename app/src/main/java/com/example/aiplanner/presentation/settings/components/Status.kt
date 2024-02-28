package com.example.aiplanner.presentation.settings.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_bold

@Composable
fun ApiStatus(
    modifier: Modifier = Modifier,
    isVerified: Boolean
) {
    val verificationIcon = if (isVerified) R.drawable.check else R.drawable.cross
    val tintColor = if (isVerified) colorResource(id = R.color.element_verified) else colorResource(id = R.color.element_unverified)
    Icon(
        modifier = modifier,
        painter = painterResource(id = verificationIcon),
        contentDescription = null,
        tint = tintColor
    )
}