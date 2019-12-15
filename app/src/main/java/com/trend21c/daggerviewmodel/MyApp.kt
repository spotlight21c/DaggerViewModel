package com.trend21c.daggerviewmodel

import android.app.Application

class MyApp : Application() {

    val appComponent by lazy {
        DaggerAppComponent.factory().create(this)
    }

}