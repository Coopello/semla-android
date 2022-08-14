package com.coopello.semla.ui.theme

import androidx.compose.material.ContentAlpha
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SemlaTextFieldColors(
    cursorColor: Color = Blue,
    focusedIndicatorColor: Color = Blue
) = TextFieldDefaults.textFieldColors(
    cursorColor = cursorColor,
    focusedIndicatorColor = focusedIndicatorColor.copy(alpha = ContentAlpha.high)
)
