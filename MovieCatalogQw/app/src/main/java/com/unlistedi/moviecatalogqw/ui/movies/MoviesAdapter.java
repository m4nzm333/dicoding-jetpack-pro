package com.unlistedi.moviecatalogqw.ui.movies;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.unlistedi.moviecatalogqw.DetailActivity;
import com.unlistedi.moviecatalogqw.R;
import com.unlistedi.moviecatalogqw.data.MovieEntity;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    private ArrayList<MovieEntity> movies;

    public MoviesAdapter(ArrayList<MovieEntity> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MoviesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MoviesViewHolder holder, final int position) {
        holder.tvListTitle.setText(movies.get(position).getTitle());
        holder.tvListScore.setText(String.valueOf(movies.get(position).getScore()));

        Glide.with(holder.itemView.getContext())
                .load(movies.get(position).getImg_path())
                .into(holder.ivPoster);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_MOVIE, movies.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.movies.size();
    }

    public void setMovies(ArrayList<MovieEntity> movies) {
        this.movies = movies;
    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder{
        TextView tvListTitle, tvListScore;
        ImageView ivPoster;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvListTitle = itemView.findViewById(R.id.tvListTitle);
            tvListScore = itemView.findViewById(R.id.tvListScore);
            ivPoster = itemView.findViewById(R.id.ivPoster);
        }
    }
}
