package com.unlistedi.academy.bookmark

import com.unlistedi.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(courseEntity: CourseEntity)
}
