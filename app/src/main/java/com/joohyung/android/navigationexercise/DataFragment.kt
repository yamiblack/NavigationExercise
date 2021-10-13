package com.joohyung.android.navigationexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_data.*

class DataFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = container?.inflate(inflater, R.layout.fragment_data)

    override fun onSetupViews(view: View) {
        dataFragmentButton.setOnClickListener {
            findNavController().navigate(R.id.action_dataFragment_to_homeFragment )
        }
    }
}