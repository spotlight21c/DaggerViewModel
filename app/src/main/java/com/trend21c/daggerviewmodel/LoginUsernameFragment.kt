package com.trend21c.daggerviewmodel

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_login_username.*
import java.lang.Exception
import javax.inject.Inject

class LoginUsernameFragment : Fragment() {
    var TAG = "LoginUsername"

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_username, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        go_password.setOnClickListener {
            it.findNavController().navigate(R.id.loginPasswordFragment)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (activity as LoginActivity).loginComponent.inject(this)
        Log.d(TAG, "viewmodelFactory" + viewModelFactory.hashCode())

        viewModel = activity?.run {
            ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel::class.java)
        } ?: throw Exception("")
        Log.d(TAG, viewModel.username + ", " + viewModel.hashCode())
    }

}
