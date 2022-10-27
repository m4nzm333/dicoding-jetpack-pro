package com.unlistedi.moviecatalogqw.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.unlistedi.moviecatalogqw.R;

public class GenreAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private Context context;
    private String[] genres;

    public GenreAdapter(Context context, String[] genres) {
        this.context = context;
        this.genres = genres;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return genres.length;
    }

    @Override
    public Object getItem(int i) {
        return genres[i];
    }

    @Override
    public long getItemId(int i) {
        return (long) i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView = layoutInflater.inflate(R.layout.item_genre, viewGroup, false);
        Button btnGenre =rowView.findViewById(R.id.btnGenre);
        btnGenre.setText(genres[i]);
        return rowView;
    }
}
