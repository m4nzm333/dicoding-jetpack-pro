package com.unlistedi.moviecatalogueku.ui.tvshows

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.unlistedi.moviecatalogueku.data.MovieEntity
import com.unlistedi.moviecatalogueku.utils.DataGenerator

class TvShowsViewModel : ViewModel() {
    val tvShows : ArrayList<MovieEntity> = DataGenerator.getTvShows()
}