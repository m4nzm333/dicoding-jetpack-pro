package com.unlistedi.moviecatalogueku.ui.movies

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.unlistedi.moviecatalogueku.data.MovieEntity
import com.unlistedi.moviecatalogueku.utils.DataGenerator

class MoviesViewModel : ViewModel() {
    val movies : ArrayList<MovieEntity> = DataGenerator.getMovies()
}