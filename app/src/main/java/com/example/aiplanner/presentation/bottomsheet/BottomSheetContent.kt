package com.example.aiplanner.presentation.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.ridley_grotesk_bold

@Composable
fun BottomSheetContent(
    onCrossIconClick : () -> Unit
){
    Column(
        modifier = Modifier
            .height(400.dp)
            .fillMaxWidth()
    ){
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topStart = CornerSize(20.dp),
                        topEnd = CornerSize(20.dp),
                        bottomStart = CornerSize(0.dp),
                        bottomEnd = CornerSize(0.dp)
                    )
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                modifier = Modifier
                    .padding(all = 15.dp),
                text = "Add New Event",
                fontFamily = ridley_grotesk_bold,
                fontSize = 18.sp
            )
            Box(
                modifier = Modifier
                    .padding(15.dp)
                    .size(35.dp)
                    .border(
                        width = 2.dp,
                        color = colorResource(id = R.color.element_bottomSheet_crossIcon),
                        shape = CircleShape
                    )
                    .clip(shape = CircleShape)
                    .clickable {
                        onCrossIconClick()
                    },
                contentAlignment = Alignment.Center
            ){
                Icon(
                    modifier = Modifier
                        .size(15.dp),
                    painter = painterResource(id = R.drawable.cross),
                    contentDescription = "Cross Icon"
                )
            }
        }
    }
}
