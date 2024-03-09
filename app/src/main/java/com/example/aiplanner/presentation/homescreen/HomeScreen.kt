package com.example.aiplanner.presentation.homescreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_black
import com.example.aiplanner.ui.theme.ridley_grotesk_bold
import com.example.aiplanner.ui.theme.ridley_grotesk_light
import com.example.aiplanner.ui.theme.ridley_grotesk_medium
import com.example.aiplanner.ui.theme.ridley_grotesk_regular
import com.example.aiplanner.ui.theme.ridley_grotesk_semibold
import com.example.aiplanner.ui.theme.ridley_grotesk_thin
import com.example.aiplanner.utils.monthAndYearHeader

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HomeScreen(
    statusBarPadding: Dp,
    onSideBarIconClick: () -> Unit
) {
    val monthYear = remember {
        monthAndYearHeader()
    }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.element_home_topBar)),
    ) {
        AdvancedTopHomeScreen(
            modifier = Modifier
                .padding(top = statusBarPadding, start = 10.dp, end = 10.dp, bottom = 25.dp),
            onSideBarIconClick = {
                onSideBarIconClick()
            },
            monthYear = monthYear
        )
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(
                topStart = CornerSize(25.dp),
                topEnd = CornerSize(25.dp),
                bottomStart = CornerSize(0.dp),
                bottomEnd = CornerSize(0.dp)
            ),
            color = colorResource(id = R.color.system_screens_background)
        ){

        }
    }
}


@Composable
private fun AdvancedTopHomeScreen(
    modifier: Modifier = Modifier,
    onSideBarIconClick: () -> Unit,
    monthYear: String
) {
    Column(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
    ){
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .wrapContentHeight()
                    .wrapContentWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 20.dp)
                        .clickable {
                            onSideBarIconClick()
                        },
                    painter = painterResource(id = R.drawable.sidebar),
                    contentDescription = "Side Menu",
                    tint = colorResource(id = R.color.element_home_topBarIconXText)
                )
                Text(
                    text = monthYear,
                    fontFamily = ridley_grotesk_regular,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = colorResource(id = R.color.element_home_topBarIconXText)
                )
            }
            Box(
                modifier = Modifier
                    .size(45.dp)
                    .padding(5.dp)
                    .background(shape = CircleShape, color = Color.Transparent),
            ){
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painterResource(id = R.drawable.userprofile),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop
                )
            }
        }
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
        ){
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                text = "Hello Alex,",
                color = colorResource(id = R.color.element_home_welcomeFontColor),
                fontFamily = ridley_grotesk_medium,
                fontSize = 20.sp,
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = colorResource(id = R.color.element_home_topBarIconXText),
                            fontSize = 25.sp,
                            fontFamily = ridley_grotesk_semibold
                        )
                    ){
                        append("You have ")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = colorResource(id = R.color.system_color_blue),
                            fontSize = 25.sp,
                            fontFamily = ridley_grotesk_bold,

                        )
                    ){
                        append("6 Events")
                    }
                },
                lineHeight = 35.sp
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "Waiting For You Today",
                color = colorResource(id = R.color.element_home_topBarIconXText),
                fontSize = 25.sp,
                fontFamily = ridley_grotesk_semibold,
                lineHeight = 35.sp
            )

        }
    }
}

