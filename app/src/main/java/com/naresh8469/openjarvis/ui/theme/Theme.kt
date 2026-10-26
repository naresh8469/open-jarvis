package com.naresh8469.openjarvis.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object VoidColor {
    val Void950 = Color(0xFF07070B)
    val Void900 = Color(0xFF0E0E14)
    val Void800 = Color(0xFF16161F)
    val Void700 = Color(0xFF22222E)
    val Void600 = Color(0xFF2E2E3D)
    val Violet = Color(0xFF7C5CFF)
    val VioletDim = Color(0xFF5B43C6)
    val Cyan = Color(0xFF3DDCFF)
    val Green = Color(0xFF3DDC97)
    val Amber = Color(0xFFFFB020)
    val Red = Color(0xFFFF5C7A)
    val TextPrimary = Color(0xFFF4F4F8)
    val TextSecondary = Color(0xFFB7B7C9)
    val TextDisabled = Color(0xFF6E6E82)
    val BorderSubtle = Color(0xFF2A2A38)
    val BorderGlow = Color(0x667C5CFF)
}

private val DarkColors = darkColorScheme(
    primary = VoidColor.Violet,
    onPrimary = Color.White,
    secondary = VoidColor.Cyan,
    background = VoidColor.Void950,
    surface = VoidColor.Void900,
    error = VoidColor.Red,
    onBackground = VoidColor.TextPrimary,
    onSurface = VoidColor.TextPrimary
)

@Composable
fun OpenJarvisTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColors,
        content = content
    )
}
