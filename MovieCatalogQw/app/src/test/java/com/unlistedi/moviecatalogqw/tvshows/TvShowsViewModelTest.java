package com.unlistedi.moviecatalogqw.tvshows;

import com.unlistedi.moviecatalogqw.data.MovieEntity;
import com.unlistedi.moviecatalogqw.ui.tvshows.TvShowsViewModel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TvShowsViewModelTest {
    private TvShowsViewModel tvShowsViewModel;

    @Before
    public void setUp(){
        tvShowsViewModel = new TvShowsViewModel();
    }

    @Test
    public void getTvShows(){
        ArrayList<MovieEntity> tvShows = tvShowsViewModel.getTvShows();
        assertNotNull(tvShows);
        assertEquals(20, tvShows.size());
    }
}