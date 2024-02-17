package com.example.aiplanner.presentation.onboarding.components

import android.graphics.Bitmap
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R
import com.example.aiplanner.ui.theme.Element_First_Circle
import com.example.aiplanner.ui.theme.Element_Second_Circle
import com.example.aiplanner.ui.theme.System_Color_White

@Composable
fun OnBoardingPage() {
    Box(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
    ) {
        val resources = LocalContext.current.resources
        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
        ) {
            drawCircle(
                color = Element_First_Circle,
                radius = 180f,
                center = Offset(x = 330f, y = 410f),
            )
            drawCircle(
                color = Element_Second_Circle,
                radius = 180f,
                center = Offset(x = 700f, y = 730f),
            )
        }
        Card(
            modifier = Modifier
                .fillMaxHeight(0.38f)
                .fillMaxWidth(0.4f)
                .align(Alignment.Center),
            shape = RoundedCornerShape(CornerSize(30.dp)),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.system_color_white))
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
            ){
                drawImage(
                    image = ImageBitmap.imageResource(
                        res = resources,
                        id = R.drawable.school
                    ),
                    topLeft = Offset(
                        x = 25.dp.toPx(),
                        y = 25.dp.toPx()
                    )
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPagePrev() {
    OnBoardingPage()
}