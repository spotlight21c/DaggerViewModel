package com.trend21c.daggerviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class ViewModelFactoryModule {
    @Provides
    fun provideViewModelFactory(viewModelMap: Map<Class<out ViewModel>, @JvmSuppressWildcards ViewModel>) : ViewModelFactory {
        return ViewModelFactory(viewModelMap)
    }
}
/*
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory
}
 */
