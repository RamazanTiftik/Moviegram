package com.ramazantiftik.moviesapp.view.mainpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ramazantiftik.moviesapp.R
import com.ramazantiftik.moviesapp.databinding.FragmentSavedBinding
import com.ramazantiftik.moviesapp.databinding.FragmentUserProfileBinding

class SavedFragment : Fragment() {

    //viewBinding
    private var _binding: FragmentSavedBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //viewBinding
        _binding = FragmentSavedBinding.inflate(inflater,container,false)
        val view = binding.root

        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}