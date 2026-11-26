package com.example.developer_profile.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFB85C42),
    onPrimary = Color(0xFFFFFFFF),
    secondary = Color(0xFF826457),
    onSecondary = Color(0xFFFFFFFF),
    background = Color(0xFFFAF5F0),
    onBackground = Color(0xFF30201C),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF30201C)
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFB49B),
    onPrimary = Color(0xFF5D1909),
    secondary = Color(0xFFE6BDAA),
    onSecondary = Color(0xFF452B22),
    background = Color(0xFF1C1513),
    onBackground = Color(0xFFF1E1D9),
    surface = Color(0xFF2B201D),
    onSurface = Color(0xFFF1E1D9)
)

@Composable
fun Developer_profileTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = ProfilTypography,
        content = content
    )
}