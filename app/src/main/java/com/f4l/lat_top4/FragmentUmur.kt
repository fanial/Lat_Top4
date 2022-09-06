package com.f4l.lat_top4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_dua.*
import kotlinx.android.synthetic.main.fragment_umur.*

class FragmentUmur : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_umur, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getUsername = arguments?.getString("username_umur")
        var getUmur = arguments?.getString("umur")
        vUsername_umur.text = getUsername
        vUmur.text = getUmur

        Toast.makeText(context, getUmur, Toast.LENGTH_SHORT).show()


    }
}