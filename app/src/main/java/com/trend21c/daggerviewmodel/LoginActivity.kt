package com.trend21c.daggerviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject
import androidx.navigation.Navigation

class LoginActivity : AppCompatActivity() {

    var TAG = "Login"

    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (application as MyApp).appComponent.loginComponent().create()
        loginComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel::class.java)
        viewModel.username = "hello"
        Log.d(TAG, viewModel.username + ", " + viewModel.hashCode())
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.nav_host_fragment).navigateUp()
    }
}
