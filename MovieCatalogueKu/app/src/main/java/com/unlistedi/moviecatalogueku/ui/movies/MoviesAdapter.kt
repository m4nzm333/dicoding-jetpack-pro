package com.unlistedi.moviecatalogueku.ui.movies

import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.unlistedi.moviecatalogueku.DetailActivity
import com.unlistedi.moviecatalogueku.R
import com.unlistedi.moviecatalogueku.data.MovieEntity
import com.unlistedi.moviecatalogueku.utils.GlideApp

class MoviesAdapter(private var movies : ArrayList<MovieEntity>) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.items_movie, parent,false))
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.tvListTitle.text = movies[position].title
        holder.tvListScore.text = movies[position].score.toString()

        GlideApp.with(holder.itemView.context)
            .load(movies[position].img_path)
            .into(holder.ivPoster)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_MOVIE, movies[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvListTitle : TextView = itemView.findViewById(R.id.tvListTitle)
        val tvListScore : TextView = itemView.findViewById(R.id.tvListScore)
        val ivPoster : ImageView = itemView.findViewById(R.id.ivPoster)
    }

}