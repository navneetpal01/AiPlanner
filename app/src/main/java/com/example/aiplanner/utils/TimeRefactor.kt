package com.example.aiplanner.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale
import java.util.logging.SimpleFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun monthAndYearHeader() : String{
    val currentDate = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("MMMM,yyy")
        .withLocale(Locale.getDefault())
    val formattedDate = currentDate.format(formatter)
    return formattedDate
}