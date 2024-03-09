package com.example.aiplanner.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
fun monthAndYearHeader() : String{
    val currentDate = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("MMMM,yyy")
        .withLocale(Locale.getDefault())
    val formattedDate = currentDate.format(formatter)
    return formattedDate
}