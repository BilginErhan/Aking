package com.erhan.aking.ui.components.splash

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.erhan.aking.R

class SplashView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attributeSet, defStyleAttr) {
    init {
        inflate(context, R.layout.layout_aking_splash_view, this)
    }
}