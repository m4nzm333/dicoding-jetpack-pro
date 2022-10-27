package com.unlistedi.academy.bookmark


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.unlistedi.academy.R
import com.unlistedi.academy.data.CourseEntity
import com.unlistedi.academy.utils.DataDummy
import kotlinx.android.synthetic.main.fragment_bookmark.*

class BookmarkFragment : Fragment(), BookmarkFragmentCallback {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bookmarkAdapter = activity?.let { BookmarkAdapter(it, this) }
        bookmarkAdapter?.courses = DataDummy.generateDummyCourses()

        rv_bookmark.layoutManager = LinearLayoutManager(context)
        rv_bookmark.setHasFixedSize(true)
        rv_bookmark.adapter = bookmarkAdapter

        return inflater.inflate(R.layout.fragment_bookmark, container, false)
    }

    override fun onShareClick(courseEntity: CourseEntity) {
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(activity)
            .setType(mimeType)
            .setChooserTitle("Bagikan aplikasi ini sekarang.")
            .setText(String.format("Segera daftar kelas %s di dicoding.com", courseEntity.title))
            .startChooser()
    }


}
