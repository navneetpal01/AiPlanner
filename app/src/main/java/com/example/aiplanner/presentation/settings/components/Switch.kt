package com.example.aiplanner.presentation.settings.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.aiplanner.R

@Composable
fun SwitchM3(
    modifier: Modifier = Modifier,
    isChecked : Boolean,
    onCheckChange : (Boolean) -> Unit
){

    Switch(
        modifier = modifier,
        checked = isChecked,
        onCheckedChange = {
            onCheckChange(it)
        },
        colors = SwitchDefaults.colors(
            checkedBorderColor = colorResource(id = R.color.system_color_blue),
            uncheckedBorderColor = colorResource(id = R.color.element_switch),
            checkedThumbColor = colorResource(id = R.color.system_color_white),
            uncheckedThumbColor = colorResource(id = R.color.system_color_white),
            checkedTrackColor = colorResource(id = R.color.system_color_blue),
            uncheckedTrackColor = colorResource(id = R.color.element_switch)
        )
    )
}