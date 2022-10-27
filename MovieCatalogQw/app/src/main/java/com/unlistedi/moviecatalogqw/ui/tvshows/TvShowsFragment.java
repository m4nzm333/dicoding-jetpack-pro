package com.unlistedi.moviecatalogqw.ui.tvshows;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.unlistedi.moviecatalogqw.R;

public class TvShowsFragment extends Fragment {
    TvShowsViewModel tvShowsViewModel;
    RecyclerView rvTvShows;
    TvShowsAdapter tvShowsAdapter;
    LinearLayoutManager linearLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tv_shows, container, false);

        tvShowsViewModel = ViewModelProviders.of(this).get(TvShowsViewModel.class);
        rvTvShows = root.findViewById(R.id.rvTvShows);
        tvShowsAdapter = new TvShowsAdapter(tvShowsViewModel.getTvShows());
        linearLayoutManager = new LinearLayoutManager(root.getContext());
        rvTvShows.setLayoutManager(linearLayoutManager);
        rvTvShows.setAdapter(tvShowsAdapter);

        return root;
    }
}