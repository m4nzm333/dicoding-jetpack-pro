package com.unlistedi.moviecatalogqw.data;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieEntity implements Parcelable {
    private String title;
    private String year;
    private int score;
    private String[] genre;
    private String description;
    private int img_path;

    private MovieEntity(Parcel in) {
        title = in.readString();
        year = in.readString();
        score = in.readInt();
        genre = in.createStringArray();
        description = in.readString();
        img_path = in.readInt();
    }

    public static final Creator<MovieEntity> CREATOR = new Creator<MovieEntity>() {
        @Override
        public MovieEntity createFromParcel(Parcel in) {
            return new MovieEntity(in);
        }

        @Override
        public MovieEntity[] newArray(int size) {
            return new MovieEntity[size];
        }
    };

    public MovieEntity(String title, String year, int score, String[] genre, String description, int img_path) {
        this.title = title;
        this.year = year;
        this.score = score;
        this.genre = genre;
        this.description = description;
        this.img_path = img_path;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(year);
        parcel.writeInt(score);
        parcel.writeStringArray(genre);
        parcel.writeString(description);
        parcel.writeInt(img_path);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg_path() {
        return img_path;
    }

    public void setImg_path(int img_path) {
        this.img_path = img_path;
    }
}
