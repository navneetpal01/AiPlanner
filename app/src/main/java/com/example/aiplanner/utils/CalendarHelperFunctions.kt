package com.example.aiplanner.utils

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import com.kizitonwose.calendar.compose.CalendarLayoutInfo
import com.kizitonwose.calendar.compose.CalendarState
import com.kizitonwose.calendar.core.CalendarMonth
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterNotNull

@Composable
fun rememberFirstCompletelyVisibleMonth(
    state : CalendarState,
) : CalendarMonth{
    val visibleMonth = remember(state){ mutableStateOf(state.firstVisibleMonth) }
    LaunchedEffect(state){
        snapshotFlow {state.layoutInfo.completelyVisibleMonths.firstOrNull() }
            .filterNotNull()
            .collect{month -> visibleMonth.value = month
        }
    }
    return visibleMonth.value
}

private val CalendarLayoutInfo.completelyVisibleMonths : List<CalendarMonth>
    get() {
        val visibleItemsInfo = this.visibleMonthsInfo.toMutableList()
        return if (visibleItemsInfo.isEmpty()) {
            emptyList()
        } else {
            val lastItem = visibleItemsInfo.last()
            val viewportSize = this.viewportEndOffset + this.viewportStartOffset
            if (lastItem.offset + lastItem.size > viewportSize) {
                visibleItemsInfo.removeLast()
            }
            val firstItem = visibleItemsInfo.firstOrNull()
            if (firstItem != null && firstItem.offset < this.viewportStartOffset) {
                visibleItemsInfo.removeFirst()
            }
            visibleItemsInfo.map { it.month }
        }
    }
