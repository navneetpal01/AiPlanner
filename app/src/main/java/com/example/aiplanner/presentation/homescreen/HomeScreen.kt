package com.example.aiplanner.presentation.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R
import com.example.aiplanner.presentation.bottomsheet.AiPlannerBottomSheet

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        val aiPlannerBottomSheet = rememberModalBottomSheetState()
        var isSheetOpen by rememberSaveable {
            mutableStateOf(false)
        }
        val density = LocalDensity.current
        var offsetX by rememberSaveable {
            mutableStateOf(0f)
        }
        var offsetY by rememberSaveable {
            mutableStateOf(0f)
        }
        FloatingActionButton(
            modifier = Modifier
                .offset(
                    x = (offsetX / density.density).dp,
                    y = (offsetY / density.density).dp
                )
                .size(85.dp)
                .padding(end = 20.dp, bottom = 20.dp)
                .align(Alignment.BottomEnd)
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consumeAllChanges()
                        offsetX += dragAmount.x
                        offsetY += dragAmount.y
                    }
                },
            onClick = {
                isSheetOpen = true
            },
            shape = CircleShape,
            containerColor = colorResource(id = R.color.element_add_button)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.add),
                contentDescription = null,
                tint = colorResource(id = R.color.system_color_white)
            )
        }
        if (isSheetOpen) {
            AiPlannerBottomSheet(
                aiPlannerSheetState = aiPlannerBottomSheet,
                onDismissed = {
                    isSheetOpen = false
                }
            )
        }

    }
}