package com.unlistedi.moviecatalogqw.ui.tvshows;

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

public class TvShowsAdapter extends RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder> {
    private ArrayList<MovieEntity> tvShows;

    public TvShowsAdapter(ArrayList<MovieEntity> tvShows) {
        this.tvShows = tvShows;
    }


    @NonNull
    @Override
    public TvShowsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TvShowsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final TvShowsViewHolder holder, final int position) {
        holder.tvListTitle.setText(tvShows.get(position).getTitle());
        holder.tvListScore.setText(String.valueOf(tvShows.get(position).getScore()));
        Glide.with(holder.itemView.getContext())
                .load(tvShows.get(position).getImg_path())
                .into(holder.ivPoster);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_MOVIE, tvShows.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }

    class TvShowsViewHolder extends RecyclerView.ViewHolder{
        TextView tvListTitle, tvListScore;
        ImageView ivPoster;

        TvShowsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvListTitle = itemView.findViewById(R.id.tvListTitle);
            tvListScore = itemView.findViewById(R.id.tvListScore);
            ivPoster = itemView.findViewById(R.id.ivPoster);
        }
    }
}
