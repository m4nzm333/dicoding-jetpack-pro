package com.unlistedi.moviecatalogueku.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MovieEntity (
    val title : String,
    val year : String,
    val score : Int,
    val genre : Array<String>,
    val description : String,
    val img_path : Int) : Parcelable{
}