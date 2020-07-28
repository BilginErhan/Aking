package com.erhan.aking.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.erhan.aking.R
import com.erhan.aking.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivitySplashBinding>(this, R.layout.activity_splash)

        val navHostFragment = NavHostFragment.create(R.navigation.splash_navigation)
        supportFragmentManager.beginTransaction()
            .add(R.id.nav_host_splash, navHostFragment, "")
            .commitNow()
    }
}