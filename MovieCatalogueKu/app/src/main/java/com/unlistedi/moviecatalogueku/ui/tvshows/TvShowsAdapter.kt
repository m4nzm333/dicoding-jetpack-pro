package com.unlistedi.moviecatalogueku.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.unlistedi.moviecatalogueku.DetailActivity
import com.unlistedi.moviecatalogueku.R
import com.unlistedi.moviecatalogueku.data.MovieEntity
import com.unlistedi.moviecatalogueku.utils.GlideApp

class TvShowsAdapter(private val tvShows : ArrayList<MovieEntity>) : RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {
    class TvShowsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvListTitle : TextView = itemView.findViewById(R.id.tvListTitle)
        val tvListScore : TextView = itemView.findViewById(R.id.tvListScore)
        val ivPoster : ImageView = itemView.findViewById(R.id.ivPoster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        return TvShowsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.items_movie, parent,false))
    }

    override fun getItemCount(): Int {
        return  tvShows.size
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        holder.tvListTitle.text = tvShows[position].title
        holder.tvListScore.text = tvShows[position].score.toString()

        GlideApp.with(holder.itemView.context)
            .load(tvShows[position].img_path)
            .into(holder.ivPoster)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_MOVIE, tvShows[position])
            holder.itemView.context.startActivity(intent)
        }
    }
}