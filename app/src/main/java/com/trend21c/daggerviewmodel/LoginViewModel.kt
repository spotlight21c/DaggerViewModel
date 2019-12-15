package com.trend21c.daggerviewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor() : ViewModel() {

    var username: String = ""
}