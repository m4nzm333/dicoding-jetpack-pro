package com.unlistedi.moviecatalogueku.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import com.unlistedi.moviecatalogueku.R

class GenreAdapter(val genres : Array<String>, val  context : Context) : BaseAdapter(){
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.items_genre, parent, false)
        val btnGenre = rowView.findViewById(R.id.btnGenre) as Button
        btnGenre.text = genres[position]
        return rowView
    }

    override fun getItem(p0: Int): Any {
        return genres[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return genres.size
    }
}