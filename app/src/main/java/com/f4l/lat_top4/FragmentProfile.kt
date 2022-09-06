package com.f4l.lat_top4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_profile.*

class FragmentProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getNmProfile = arguments?.getString("username_profile")
        vUsername_profile.text  = getNmProfile

        Toast.makeText(context, getNmProfile, Toast.LENGTH_SHORT).show()

        btn_keluar.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentProfile_to_fragmentSatu)
        }
    }

}