package com.example.cuadricula.Modelo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nombres: Int,
    val cuadriexiste: Int,
    @DrawableRes val picturesres: Int
)