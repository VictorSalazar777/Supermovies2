package com.manuelsoft.supermovies2.ui.movie

import com.manuelsoft.supermovies2.model.PopularMovie
import com.manuelsoft.supermovies2.ui.BaseViewModel
import com.manuelsoft.supermovies2.usecases.LoadSelectedPopularMovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FragmentMovieViewModel @Inject constructor(
    private val loadSelectedPopularMovieUseCase: LoadSelectedPopularMovieUseCase
    ) : BaseViewModel() {

    fun loadSelectedPopularMovie(): PopularMovie {
        return loadSelectedPopularMovieUseCase()
    }

}