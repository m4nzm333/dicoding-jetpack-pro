package com.unlistedi.moviecatalogqw;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.unlistedi.moviecatalogqw.data.MovieEntity;
import com.unlistedi.moviecatalogqw.utils.GenreAdapter;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    private GenreAdapter genreAdapter;
    private TextView tvDetailTitle, tvDetailScore, tvDetailYear, tvDetailDescription;
    private ImageView ivDetailPoster;
    private MovieEntity movieEntity;
    private GridView gvGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        movieEntity = getIntent().getParcelableExtra(EXTRA_MOVIE);
        if(movieEntity != null){
            genreAdapter = new GenreAdapter(this, movieEntity.getGenre());

            gvGenre = findViewById(R.id.gvGenre);
            tvDetailTitle = findViewById(R.id.tvDetailTitle);
            tvDetailScore = findViewById(R.id.tvDetailScore);
            tvDetailYear = findViewById(R.id.tvDetailYear);
            tvDetailDescription = findViewById(R.id.tvDetailDescription);
            ivDetailPoster = findViewById(R.id.ivDetailPoster);

            gvGenre.setAdapter(genreAdapter);
            tvDetailTitle.setText(movieEntity.getTitle());
            tvDetailScore.setText(String.valueOf(movieEntity.getScore()));
            tvDetailYear.setText(movieEntity.getYear());
            tvDetailDescription.setText(movieEntity.getDescription());
            ivDetailPoster.setImageResource(movieEntity.getImg_path());
            gvGenre.setAdapter(genreAdapter);
        }

    }
}
