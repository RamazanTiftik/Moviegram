package com.ramazantiftik.moviesapp.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import com.ramazantiftik.moviesapp.domain.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HomeFragmentViewModel @Inject constructor(
    private val repository: MovieRepository,
    application: Application
) : BaseViewModel(application) {

    suspend fun getMovies(search: String){

        return withContext(Dispatchers.IO){
            val postList = repository.getMovies(search)
            postList
        }

    }

}