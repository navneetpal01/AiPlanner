package com.example.aiplanner.presentation.onboarding.components

data class Page(
    val content : String,
    val description : String
)


val pages = listOf(
    Page(
        content = "Manage your Task\n" +
                "& Projects Easily",
        description = "It is a long established fact that a reader will be distracted by the readable content"
    ),
    Page(
        content = "Easier way to\nImprove your Skills",
        description = "It is a long established fact that a reader will be distracted by the readable content"
    ),
    Page(
        content = "Collaborate with your\nTeam more Closely",
        description = "It is a long established fact that a reader will be distracted by the readable content"
    )
)