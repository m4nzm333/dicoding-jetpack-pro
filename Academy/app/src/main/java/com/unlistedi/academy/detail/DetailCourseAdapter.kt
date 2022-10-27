package com.unlistedi.academy.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.unlistedi.academy.R
import com.unlistedi.academy.data.ModuleEntity

class DetailCourseAdapter : RecyclerView.Adapter<DetailCourseAdapter.ModuleViewHolder>() {
    lateinit var modules : ArrayList<ModuleEntity>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        return ModuleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.items_module_list, parent,false))
    }

    override fun getItemCount(): Int {
        return modules.size
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        holder.textTitle.text = modules[position].courseId
    }

    class ModuleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle  : TextView = itemView.findViewById(R.id.text_module_title)
    }


}