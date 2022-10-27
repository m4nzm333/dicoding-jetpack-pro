package com.unlistedi.moviecatalogueku.ui.movies

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MoviesViewModelTest {
    private lateinit var moviesViewModel: MoviesViewModel

    @Before
    fun setUp(){
        moviesViewModel = MoviesViewModel()
    }

    @Test
    fun getMovies(){
        val movies = moviesViewModel.movies
        assertNotNull(movies)
        // Jumlah Asset yang disediakan hanya 19
        assertEquals(19, movies.size)
    }
}