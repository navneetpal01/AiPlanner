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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.settings.components.ApiStatus
import com.example.aiplanner.presentation.settings.components.OpenAiProfile
import com.example.aiplanner.presentation.settings.components.SwitchM3
import com.example.aiplanner.ui.theme.ridley_grotesk_light
import com.example.aiplanner.ui.theme.ridley_grotesk_medium
import com.example.aiplanner.ui.theme.ridley_grotesk_regular
import com.example.aiplanner.ui.theme.ridley_grotesk_semibold

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
                    .clip(RoundedCornerShape(CornerSize(15.dp))),
                contentAlignment = Alignment.Center
            ) {
                OpenAiProfile(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                )
                Column(
                    modifier = Modifier
                        .align(Alignment.Center),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Chat Gpt Key",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.element_onboarding_text_first_color),
                        fontFamily = ridley_grotesk_regular
                    )
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Status",
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.element_onboarding_text_first_color),
                            fontWeight = FontWeight.Bold,
                            fontFamily = ridley_grotesk_light
                        )
                        ApiStatus(
                            modifier = Modifier
                                .padding(start = 5.dp),
                            isVerified = false
                        )
                    }
                }
                Icon(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .size(40.dp)
                        .padding(end = 10.dp),
                    painter = painterResource(id = R.drawable.arrow_right),
                    contentDescription = null,
                    tint = colorResource(id = R.color.element_Icon_arrow_tint)
                )
            }
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
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterStart),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.darkmode),
                            contentDescription = null,
                            tint = colorResource(id = R.color.element_icon_settings)
                        )
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 5.dp),
                            text = "Dark Mode",
                            fontSize = 15.sp,
                            fontFamily = ridley_grotesk_semibold,
                            color = colorResource(id = R.color.element_icon_settings)
                        )
                    }
                    SwitchM3(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .align(Alignment.CenterEnd),
                        isChecked = darkMode,
                        onCheckChange = {
                            darkMode = it
                        }
                    )
                }
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 2.dp,
                    color = colorResource(id = R.color.element_divider)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterStart),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            modifier = Modifier
                                .padding(horizontal = 10.dp)
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.notification),
                            contentDescription = null,
                            tint = colorResource(id = R.color.element_icon_settings)
                        )
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 5.dp),
                            text = "Notifications",
                            fontSize = 15.sp,
                            fontFamily = ridley_grotesk_semibold,
                            color = colorResource(id = R.color.element_icon_settings)
                        )
                    }
                    SwitchM3(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .align(Alignment.CenterEnd),
                        isChecked = notification,
                        onCheckChange = {
                            notification = it
                        }
                    )
                }
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
                Divider(
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
                Divider(
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
                Divider(
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
                Divider(
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
                Divider(
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