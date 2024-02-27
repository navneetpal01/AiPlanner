package com.example.aiplanner.presentation.bottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.aiplanner.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiPlannerBottomSheet(
    aiPlannerSheetState : SheetState,
    onDismissed : () -> Unit
){
    ModalBottomSheet(
        modifier = Modifier
            .statusBarsPadding(),
        sheetState = aiPlannerSheetState,
        onDismissRequest = {
            onDismissed()
        },
        containerColor = colorResource(id = R.color.system_color_white)
    ) {
       Column(
           modifier = Modifier
               .height(300.dp)
               .fillMaxWidth(),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center
       ){
           Text(text = "John")
           Text(text = "Peter")
           Text(text = "Lewis")
           Text(text = "Andrew")
       }
    }
}
