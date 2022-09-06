package com.f4l.lat_top4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dua.*
import kotlinx.android.synthetic.main.fragment_satu.*

class FragmentDua : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUsername = arguments?.getString("username")
        vUsername.text = getUsername
        val username = vUsername.text.toString()

        Toast.makeText(context, getUsername, Toast.LENGTH_SHORT).show()

        btn_frag2.setOnClickListener {
            var tahun = inThnLahir.text.toString().toInt()
            var calUmur = (2022 - tahun).toString()
            val dataUmur = Bundle()
            dataUmur.putString("username_umur", username)
            dataUmur.putString("umur", calUmur)
            Navigation.findNavController(view).navigate(R.id.action_fragmentDua_to_fragmentUmur, dataUmur)
        }

        btn_profile.setOnClickListener{
            val dataProfile = Bundle()
            dataProfile.putString("username_profile", username)
            Navigation.findNavController(view).navigate(R.id.action_fragmentDua_to_fragmentProfile, dataProfile)
        }
    }

}