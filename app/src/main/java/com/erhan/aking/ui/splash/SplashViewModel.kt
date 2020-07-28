package com.erhan.aking.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    val isReadyAppLiveData: LiveData<Boolean>
        get() = isReadyAppMutableLiveData

    private var isReadyAppMutableLiveData: MutableLiveData<Boolean> = MutableLiveData()


    fun animtionDelay() {
        viewModelScope.launch {
            delay(2500)
            isReadyAppMutableLiveData.value = true
        }
    }
}