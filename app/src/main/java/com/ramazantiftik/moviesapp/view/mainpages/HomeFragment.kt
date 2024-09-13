package com.ramazantiftik.moviesapp.view.mainpages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ramazantiftik.moviesapp.R
import com.ramazantiftik.moviesapp.databinding.FragmentHomeBinding
import com.ramazantiftik.moviesapp.databinding.FragmentMovieSearchBinding
import com.ramazantiftik.moviesapp.domain.model.Movie
import com.ramazantiftik.moviesapp.viewmodels.HomeFragmentViewModel

class HomeFragment : Fragment() {

    //viewBinding
    private var _binding: FragmentHomeBinding?=null
    private val binding get() = _binding!!

    //postList
    private lateinit var postList: ArrayList<Movie>

    //viewModel
    lateinit var viewModel: HomeFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //viewBinding
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view = binding.root

        //initialize viewModel
        viewModel= ViewModelProvider(requireActivity()).get(HomeFragmentViewModel::class.java)

        //initialize arrayList
        postList=ArrayList<Movie>()

        postList=viewModel.getMovies("batman")


        //***** Nav Buttons *****


        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}