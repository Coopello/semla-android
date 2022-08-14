package com.coopello.semla.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

// private val DarkColorPalette = darkColors(
//    primary = LightBlue,
//    primaryVariant = DarkBlue,
//    secondary = LightBlue,
//    secondaryVariant = DarkBlue
// )

private val LightColorPalette = lightColors(
    primary = Blue,
    primaryVariant = DarkBlue,
    secondary = Blue,
    secondaryVariant = DarkBlue,
    background = Gray
)

@Composable
fun SemlaTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }

    val colors = LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
