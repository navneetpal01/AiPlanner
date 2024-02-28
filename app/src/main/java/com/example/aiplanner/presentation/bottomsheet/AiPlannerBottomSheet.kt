package com.example.aiplanner.presentation.bottomsheet

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_regular
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun AiPlannerBottomSheet(
    aiPlannerSheetState: SheetState,
    onDismissed: () -> Unit
) {
    val tabItems = listOf<TabItems>(
        TabItems(
            tabName = "Profile",
            icon = painterResource(id = R.drawable.work)
        ),
        TabItems(
            tabName = "Today's Tasks",
            icon = painterResource(id = R.drawable.edit)
        ),
        TabItems(
            tabName = "Ai Shedule",
            icon = painterResource(id = R.drawable.themes)
        )
    )
    val pagerState = rememberPagerState(initialPage = 0) {
        tabItems.size
    }
    val coroutine = rememberCoroutineScope()
    ModalBottomSheet(
        modifier = Modifier
            .navigationBarsPadding(),
        sheetState = aiPlannerSheetState,
        onDismissRequest = {
            onDismissed()
        },
        containerColor = colorResource(id = R.color.system_screens_background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top
        ){
            HorizontalPager(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                state = pagerState
            ) { page ->
                Text(text = tabItems[page].tabName)
            }
            TabRow(
                selectedTabIndex = pagerState.currentPage,
                containerColor = colorResource(id = R.color.system_color_white),
                indicator = {tabPositions ->
                    TabRowDefaults.Indicator(color = colorResource(id = R.color.system_color_black),
                        modifier = Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]).width(0.dp).height(0.dp)
                    )
                }
            ) {
                tabItems.forEachIndexed { index, item ->
                    Tab(
                        selected = pagerState.currentPage == index,
                        onClick = {
                            coroutine.launch {
                                pagerState.animateScrollToPage(page = index)
                            }
                        },
                        icon = {
                               Icon(
                                   painter = tabItems[index].icon,
                                   contentDescription = null
                               )
                        },
                        text = {
                            Text(
                                text = tabItems[index].tabName,
                                color = colorResource(id = R.color.system_color_black),
                                fontFamily = ridley_grotesk_regular,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )
                        },
                        selectedContentColor = colorResource(id = R.color.system_color_blue),
                        unselectedContentColor = colorResource(id = R.color.system_color_blue)
                    )
                }
            }
        }
    }
}

data class TabItems(
    val tabName : String,
    val icon : Painter
)
