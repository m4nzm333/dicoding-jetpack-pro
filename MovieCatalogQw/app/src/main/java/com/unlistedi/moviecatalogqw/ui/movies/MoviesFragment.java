package com.unlistedi.moviecatalogqw.ui.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unlistedi.moviecatalogqw.R;
import com.unlistedi.moviecatalogqw.utils.DataGenerator;

public class MoviesFragment extends Fragment {
    MoviesViewModel moviesViewModel;
    RecyclerView rvMovies;
    MoviesAdapter moviesAdapter;
    LinearLayoutManager linearLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_movies, container, false);

        moviesViewModel = ViewModelProviders.of(this).get(MoviesViewModel.class);
        rvMovies = root.findViewById(R.id.rvMovies);
        moviesAdapter = new MoviesAdapter(moviesViewModel.getMovies());
        linearLayoutManager = new LinearLayoutManager(root.getContext());
        rvMovies.setLayoutManager(linearLayoutManager);
        rvMovies.setAdapter(moviesAdapter);

        return root;
    }
}