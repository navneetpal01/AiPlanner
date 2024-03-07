package com.example.aiplanner.presentation.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.settings.components.AiPlannerSettings
import com.example.aiplanner.ui.theme.ridley_grotesk_medium

@Composable
fun SettingScreen() {
    var darkMode by remember { mutableStateOf(false) }
    var notification by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 25.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(
                text = "Settings",
                color = colorResource(id = R.color.element_onboarding_text_first_color),
                fontSize = 35.sp,
                fontFamily = ridley_grotesk_medium
            )
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            shadowElevation = 1.dp,
            color = colorResource(id = R.color.system_color_white),
            shape = RoundedCornerShape(CornerSize(15.dp))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { }
                    .clip(RoundedCornerShape(CornerSize(15.dp)))
            )
        }
        Spacer(modifier = Modifier.height(35.dp))
        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            shadowElevation = 1.dp,
            color = colorResource(id = R.color.system_color_white),
            shape = RoundedCornerShape(CornerSize(15.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Top
            ) {
                AiPlannerSettings(
                    isChecked = darkMode,
                    displayText = "Dark Mode",
                    displayIcon = painterResource(id = R.drawable.darkmode),
                    onCheckChange = {
                        darkMode = it
                    }
                )
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                AiPlannerSettings(
                    isChecked = notification,
                    displayText = "Notification",
                    displayIcon = painterResource(id = R.drawable.notification),
                    onCheckChange = {
                        notification = it
                    }
                )
            }
        }

        //TODO
        Spacer(modifier = Modifier.height(15.dp))
        Surface(
            modifier = Modifier
                .fillMaxWidth(),
            shadowElevation = 1.dp,
            color = colorResource(id = R.color.system_color_white),
            shape = RoundedCornerShape(CornerSize(15.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Top
            ) {
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                }
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                }

            }
        }
    }
}
