package com.unlistedi.moviecatalogqw.movies;
import com.unlistedi.moviecatalogqw.data.MovieEntity;
import com.unlistedi.moviecatalogqw.ui.movies.MoviesViewModel;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class MoviesViewModelTest {
    private MoviesViewModel moviesViewModel;

    @Before
    public void setUp(){
        moviesViewModel = new MoviesViewModel();
    }

    @Test
    public void getMovies(){
        ArrayList<MovieEntity> movies = moviesViewModel.getMovies();
        assertNotNull(movies);
        assertEquals(19, movies.size());
    }
}