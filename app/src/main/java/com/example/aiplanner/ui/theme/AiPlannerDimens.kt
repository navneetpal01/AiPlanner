package com.example.aiplanner.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R

val ridley_grotesk_bold = FontFamily(Font(R.font.ridley_grotesk_bold))
data class AiPlannerDimens(
    val oneDp : Dp,
    val oneSp : TextUnit
)

val smallAiPlannerDimens = AiPlannerDimens(
    oneDp = 1.dp,
    oneSp = 1.sp
)

//Main
val compactAiPlannerDimens = AiPlannerDimens(
    oneDp = 1.dp,
    oneSp = 1.sp
)

val mediumAiPlannerDimens = AiPlannerDimens(
    oneDp = 1.dp,
    oneSp = 1.sp
)

val largeAiPlannerDimens = AiPlannerDimens(
    oneDp = 1.dp,
    oneSp = 1.sp
)


//TODO::
/* Testing Cleared
1- <360
2- 361 -> 400
3- 401 -> 720

 */