package com.example.meditationlayout


import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title : String,
    @DrawableRes val iconId : Int,
    val lightColor : Color,
    val MediumColor : Color,
    val DarkColor : Color
)
