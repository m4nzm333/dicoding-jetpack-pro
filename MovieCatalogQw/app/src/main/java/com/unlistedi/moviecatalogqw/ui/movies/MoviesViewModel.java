package com.unlistedi.moviecatalogqw.ui.movies;

import androidx.lifecycle.ViewModel;

import com.unlistedi.moviecatalogqw.data.MovieEntity;
import com.unlistedi.moviecatalogqw.utils.DataGenerator;

import java.util.ArrayList;

public class MoviesViewModel extends ViewModel {
    private ArrayList<MovieEntity> movies = DataGenerator.getMovies();

    public ArrayList<MovieEntity> getMovies() {
        return movies;
    }
}
