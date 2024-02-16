package com.example.aiplanner.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun ProvideAppUtils(
    aiPlannerDimens : AiPlannerDimens,
    orientation: Orientation,
    content : @Composable () -> Unit
){
    val aiPlannerDimens = remember {aiPlannerDimens}
    val orientation = remember { orientation}

    CompositionLocalProvider(
        LocalAiPlannerDimens provides aiPlannerDimens,
        LocalOrientationMode provides orientation,
        content = content
    )
}

val LocalAiPlannerDimens = compositionLocalOf {
    smallAiPlannerDimens
}

val LocalOrientationMode = compositionLocalOf {
    Orientation.Portrait
}