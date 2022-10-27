package com.unlistedi.moviecatalogqw.ui.tvshows;

import androidx.lifecycle.ViewModel;

import com.unlistedi.moviecatalogqw.data.MovieEntity;
import com.unlistedi.moviecatalogqw.utils.DataGenerator;

import java.util.ArrayList;

public class TvShowsViewModel extends ViewModel {
    private ArrayList<MovieEntity> tvShows = DataGenerator.getTvShows();

    public ArrayList<MovieEntity> getTvShows() {
        return tvShows;
    }
}
