package com.unlistedi.academy.academy

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.unlistedi.academy.R
import com.unlistedi.academy.data.CourseEntity
import com.unlistedi.academy.detail.DetailCourseActivity
import com.unlistedi.academy.utils.GlideApp

class AcademyAdapter(val activity: Activity) :
    RecyclerView.Adapter<AcademyAdapter.AcademyViewHolder>() {
    var courses : ArrayList<CourseEntity> = ArrayList()

    override fun onBindViewHolder(holder: AcademyViewHolder, position: Int) {
        holder.tvTitle.text = courses[position].title
        holder.tvDescription.text = courses[position].description
        holder.tvDate.text = courses[position].deadline
        holder.itemView.setOnClickListener {
            val intent = Intent(activity, DetailCourseActivity::class.java)
            intent.putExtra(DetailCourseActivity.EXTRA_COURSE, courses[position].courseId)
            activity.startActivity(intent)
        }

        GlideApp.with(activity)
            .load(courses[position].imagePath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
            .into(holder.imgPoster)
    }

    class AcademyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle : TextView = itemView.findViewById(R.id.tv_item_title)
        val tvDescription : TextView = itemView.findViewById(R.id.img_poster)
        val tvDate : TextView = itemView.findViewById(R.id.tv_item_description)
        val imgPoster : ImageView = itemView.findViewById(R.id.tv_item_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AcademyViewHolder {
        return AcademyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.items_academy, parent,false))
    }

    override fun getItemCount(): Int {
        return courses.size
    }

}