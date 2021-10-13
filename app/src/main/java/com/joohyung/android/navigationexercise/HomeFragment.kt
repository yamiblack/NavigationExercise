package com.joohyung.android.navigationexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = container?.inflate(inflater, R.layout.fragment_home)

    override fun onSetupViews(view: View) {
        homeFragmentButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_dataFragment )
        }
    }
}