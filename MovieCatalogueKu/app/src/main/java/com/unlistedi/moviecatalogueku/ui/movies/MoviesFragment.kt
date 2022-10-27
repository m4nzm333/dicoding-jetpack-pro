package com.unlistedi.moviecatalogueku.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.unlistedi.moviecatalogueku.R
import kotlinx.android.synthetic.main.fragment_movies.view.*

class MoviesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        val moviesViewModel = ViewModelProviders.of(this).get(MoviesViewModel::class.java)

        view.rvMovies.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = MoviesAdapter(moviesViewModel.movies)
        }

        return view
    }
}