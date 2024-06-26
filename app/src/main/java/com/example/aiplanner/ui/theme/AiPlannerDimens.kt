package com.example.aiplanner.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aiplanner.R

val ridley_grotesk_semibold = FontFamily(Font(R.font.ridley_grotesk_semibold))
//Bottom Text
val ridley_grotesk_light = FontFamily(Font(R.font.ridley_grotesk_light))
//Regular
val ridley_grotesk_regular = FontFamily(Font(R.font.ridley_grotesk_regular))
val ridley_grotesk_medium = FontFamily(Font(R.font.ridley_grotesk_medium))
val ridley_grotesk_bold = FontFamily(Font(R.font.ridley_grotesk_bold))
val ridley_grotesk_black = FontFamily(Font(R.font.ridley_grotesk_black))
val ridley_grotesk_thin = FontFamily(Font(R.font.ridley_grotesk_thin))
val ridley_grotesk_extraBold = FontFamily(Font(R.font.ridley_grotesk_extrabold))


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