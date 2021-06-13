package com.widlof.composeplayground.core.ui

import androidx.compose.ui.unit.Dp

class Dimensions {
    companion object {
        const val DEFAULT_MARGIN = 16f
        fun Float.toDp(): Dp {
            return Dp(this)
        }
    }
}