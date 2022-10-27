package com.unlistedi.moviecatalogueku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.unlistedi.moviecatalogueku.data.MovieEntity
import com.unlistedi.moviecatalogueku.utils.GenreAdapter
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.items_genre.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "movie_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movieEntity = intent.getParcelableExtra<MovieEntity>(EXTRA_MOVIE)

        if (movieEntity != null){
            val genreAdapter = GenreAdapter(movieEntity.genre, this)
            gvGenre.adapter = genreAdapter

            tvDetailTitle.text = movieEntity.title
            ivDetailPoster.setImageResource(movieEntity.img_path)
            tvDetailScore.text = movieEntity.score.toString() + "%"
            tvDetailYear.text = movieEntity.year
            tvDetailDescription.text = movieEntity.description
        }

    }

}

