package com.unlistedi.moviecatalogueku.ui.tvshows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.unlistedi.moviecatalogueku.R
import kotlinx.android.synthetic.main.fragment_tv_shows.view.*

class TvShowsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tv_shows, container, false)
        val tvShowsViewModel = ViewModelProviders.of(this).get(TvShowsViewModel::class.java)
        view.rvTvShows.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = TvShowsAdapter(tvShowsViewModel.tvShows)
        }

        return view
    }
}