package com.unlistedi.moviecatalogueku.ui.tvshows

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowsViewModelTest {
    private lateinit var tvShowsViewModel: TvShowsViewModel

    @Before
    fun setUp(){
        tvShowsViewModel = TvShowsViewModel()
    }

    @Test
    fun getMovies(){
        val tvShows = tvShowsViewModel.tvShows
        assertNotNull(tvShows)
        assertEquals(20, tvShows.size)
    }
}