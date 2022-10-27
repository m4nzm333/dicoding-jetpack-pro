package com.unlistedi.academy.data

class CourseEntity(
    var courseId: String,
    var title: String,
    var description: String,
    var deadline: String,
    var bookmarked: Boolean? = false,
    var imagePath: String){

    init {
        if (bookmarked == null) {
            bookmarked = false
        }
    }
}