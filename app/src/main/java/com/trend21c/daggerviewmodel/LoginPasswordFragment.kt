package com.trend21c.daggerviewmodel

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_login_password.*
import java.lang.Exception
import javax.inject.Inject

class LoginPasswordFragment : Fragment() {
    var TAG = "LoginPassword"

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        go_main.setOnClickListener {
            activity?.finish()
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
