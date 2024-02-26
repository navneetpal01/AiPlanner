package com.example.aiplanner.presentation.bottomsheet

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiPlannerBottomSheet(
    aiPlannerSheetState : SheetState,
    onDismissed : () -> Unit
){
    ModalBottomSheet(
        sheetState = aiPlannerSheetState,
        onDismissRequest = {
            onDismissed()
        }
    ) {
       Column(
           modifier = Modifier
               .fillMaxHeight(0.4f)
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
