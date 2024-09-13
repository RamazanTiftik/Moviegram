package com.ramazantiftik.moviesapp.view.startpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ramazantiftik.moviesapp.R
import com.ramazantiftik.moviesapp.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    //viewBinding
    private var _binding: FragmentSignInBinding?=null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //viewBinding
        _binding = FragmentSignInBinding.inflate(inflater,container,false)
        val view=binding.root



        //***** Nav Buttons *****
        binding.signUpBtnSignInSc.setOnClickListener {
            val action=SignUpFragmentDirections.actionSignUpFragmentToSignInFragment()
            Navigation.findNavController(it).navigate(action)
        }

        binding.signInBtnSignInSc.setOnClickListener {
            val action=SignInFragmentDirections.actionSignInFragmentToHomeFragment()
            Navigation.findNavController(it).navigate(action)
        }


        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}