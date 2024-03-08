package com.example.aiplanner.presentation.homescreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_regular
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
                .padding(top = statusBarPadding),
            onSideBarIconClick = {
                onSideBarIconClick()
            },
            monthYear = monthYear
        )

    }
}


@Composable
private fun AdvancedTopHomeScreen(
    modifier: Modifier = Modifier,
    onSideBarIconClick: () -> Unit,
    monthYear: String
) {
    Row(
        modifier = modifier
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
                    .size(50.dp)
                    .padding(all = 10.dp)
                    .clickable {
                        onSideBarIconClick()
                    },
                painter = painterResource(id = R.drawable.sidebar),
                contentDescription = "Side Menu",
                tint = colorResource(id = R.color.element_home_topBarIcon)
            )
            Text(
                text = monthYear,
                fontFamily = ridley_grotesk_regular,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = colorResource(id = R.color.element_home_topBarIcon)
            )
        }
    }
}

