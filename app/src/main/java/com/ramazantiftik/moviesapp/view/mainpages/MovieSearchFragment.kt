package com.ramazantiftik.moviesapp.view.mainpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ramazantiftik.moviesapp.R
import com.ramazantiftik.moviesapp.databinding.FragmentMovieSearchBinding
import com.ramazantiftik.moviesapp.databinding.FragmentSavedBinding

class MovieSearchFragment : Fragment() {

    //viewBinding
    private var _binding: FragmentMovieSearchBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //viewBinding
        _binding = FragmentMovieSearchBinding.inflate(inflater,container,false)
        val view = binding.root

        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}