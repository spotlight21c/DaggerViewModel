package com.trend21c.daggerviewmodel

import dagger.Component

@Component(modules = [MainModule::class, ViewModelModule::class, ViewModelFactoryModule::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}