package com.trend21c.daggerviewmodel

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, ViewModelFactoryModule::class, SubcomponentsModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun mainComponent(): MainComponent.Factory

    fun loginComponent(): LoginComponent.Factory
}