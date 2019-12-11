package com.trend21c.daggerviewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel() {

    fun getMyName(): String {
        return "Hello World"
    }
}