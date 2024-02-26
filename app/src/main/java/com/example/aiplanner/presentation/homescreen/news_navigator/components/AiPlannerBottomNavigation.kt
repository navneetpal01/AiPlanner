package com.example.aiplanner.presentation.homescreen.news_navigator.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R

@Composable
fun AiPlannerBottomNavigation(
    items : List<BottomNavigationItem>,
    selected : Int,
    onItemClick : (Int) -> Unit
){
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = colorResource(id = R.color.element_navigation_bar),
        tonalElevation = 10.dp
    ){
        items.forEachIndexed{ index, item ->
            NavigationBarItem(
                selected = index == selected,
                onClick = { onItemClick(index) },
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Icon(
                            modifier = Modifier.size(17.dp),
                            painter = painterResource(id = item.icon),
                            contentDescription = null
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = item.text, style = MaterialTheme.typography.labelSmall)
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = colorResource(id = R.color.system_color_blue),
                    selectedTextColor = colorResource(id = R.color.system_color_blue),
                    unselectedIconColor = colorResource(id = R.color.system_color_black),
                    unselectedTextColor = colorResource(id = R.color.system_color_black),
                    indicatorColor = colorResource(id = R.color.system_color_white)
                )
            )
        }
    }
}

data class BottomNavigationItem(
    @DrawableRes val icon : Int,
    val text : String
)

