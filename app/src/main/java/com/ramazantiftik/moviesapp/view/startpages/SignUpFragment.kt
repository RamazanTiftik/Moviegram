package com.ramazantiftik.moviesapp.view.startpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ramazantiftik.moviesapp.R
import com.ramazantiftik.moviesapp.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    //viewBinding
    private var _binding: FragmentSignUpBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //viewBinding
        _binding = FragmentSignUpBinding.inflate(inflater,container,false)
        val view = binding.root

        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}