package com.unlistedi.myviewmodel

import androidx.lifecycle.ViewModel

open class MainViewModel : ViewModel() {
    var result = 0

    fun calculate(width : String, height : String, length : String){
        result = width.toInt() * height.toInt() * length.toInt()
    }
}