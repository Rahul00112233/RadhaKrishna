package com.example.radhadrishna.model

import android.media.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class DataClass(
    val image: Painter,
    val text: String,
    val icon: ImageVector,
    val views: String
)
