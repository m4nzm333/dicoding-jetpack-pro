package com.unlistedi.academy.detail

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.request.RequestOptions
import com.unlistedi.academy.R
import com.unlistedi.academy.reader.CourseReaderActivity
import com.unlistedi.academy.utils.DataDummy
import com.unlistedi.academy.utils.GlideApp

import kotlinx.android.synthetic.main.activity_detail_course.*
import kotlinx.android.synthetic.main.content_detail_course.*
import kotlinx.android.synthetic.main.fragment_module_list.*
import kotlinx.android.synthetic.main.fragment_module_list.rv_module

class DetailCourseActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_course)
        setSupportActionBar(toolbar)

        toolbar.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val detailCourseAdapter = DetailCourseAdapter()
        val extras = intent.extras
        if (extras != null){
            val courseId = extras.getString(EXTRA_COURSE)
            if(courseId != null){
                detailCourseAdapter.modules = DataDummy.generateDummyModules(courseId)
                populateCourse(courseId)
            }
        }

        rv_module.layoutManager = LinearLayoutManager(this)
        rv_module.adapter = detailCourseAdapter
    }

    fun populateCourse(courseId : String){
        val courseEntity = DataDummy.getCourses(courseId)

        text_title.text = courseEntity?.courseId
        text_description.text = courseEntity?.description
        text_date.text = courseEntity?.deadline

        GlideApp.with(this)
            .load(courseEntity?.imagePath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
            .into(image_poster)
        btn_start.setOnClickListener {
            val intent = Intent(this, CourseReaderActivity::class.java)
            intent.putExtra(CourseReaderActivity.EXTRA_COURSE_ID, courseId)
            startActivity(intent)
        }
    }

}
