package com.example.aiplanner.presentation.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { }
                    .clip(RoundedCornerShape(CornerSize(15.dp))),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                OpenAiProfile(
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )
                Column(
                ) {
                    Text(
                        text = "Chat Gpt Key",
                        color = colorResource(id = R.color.element_onboarding_text_first_color),
                        fontFamily = ridley_grotesk_bold
                    )
                }
                Icon(
                    modifier = Modifier
                        .size(70.dp)
                        .padding(horizontal = 20.dp),
                    painter = painterResource(id = R.drawable.arrow_right),
                    contentDescription = null,
                    tint = colorResource(id = R.color.element_settingIcon_tint)
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
            ){
                Row(
                    modifier = Modifier
                        .height(30.dp)
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
                        .height(30.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                }
            }
        }
    }
}