package com.f4l.lat_top4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_satu.*

class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            var username = inUsername.text.toString()
            var pass = inPass.text.toString()
            var dataLogin = Bundle()
            dataLogin.putString("username", username)

            if (username.equals("fanial") && pass.equals("fanilucu123")) {
                Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show()
                Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentDua, dataLogin)
            } else {
                Toast.makeText(context, "Username dan password tidak terdaftar", Toast.LENGTH_SHORT).show()
            }

        }

        lupa_pass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentTiga)
        }

        register.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentEmpat)
        }

        chat.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentLima)
        }

        help.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentEnam)
        }
    }




}