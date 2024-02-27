package com.example.aiplanner.presentation.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.settings.components.OpenAiProfile
import com.example.aiplanner.ui.theme.ridley_grotesk_bold
import com.example.aiplanner.ui.theme.ridley_grotesk_medium

@Composable
fun SettingScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ){
            Text(
                text = "Settings",
                color = colorResource(id = R.color.element_onboarding_text_first_color),
                fontSize = 35.sp,
                fontFamily = ridley_grotesk_medium
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
                .background(
                    color = colorResource(id = R.color.system_color_white),
                    shape = RoundedCornerShape(CornerSize(15.dp))
                )
                .clip(RoundedCornerShape(CornerSize(15.dp)))
                .clickable { },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            OpenAiProfile(
                modifier = Modifier
                    .padding(10.dp),
                isVerified = true
            )
            Column(
            ){
                Text(
                    text = "Chat Gpt Key",
                    color = colorResource(id = R.color.element_onboarding_text_first_color),
                    fontFamily = ridley_grotesk_bold
                )
            }
            Icon(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = null,
                tint = colorResource(id = R.color.element_settingIcon_tint)
            )
        }
    }
}