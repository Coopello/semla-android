package com.coopello.semla.ui.theme

import androidx.compose.material.ContentAlpha
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SemlaTextFieldColors(
    backgroundColor: Color = Color.White,
    cursorColor: Color = Blue,
    focusedIndicatorColor: Color = Blue
) = TextFieldDefaults.textFieldColors(
    backgroundColor = backgroundColor,
    cursorColor = cursorColor,
    focusedIndicatorColor = focusedIndicatorColor.copy(alpha = ContentAlpha.high)
)
