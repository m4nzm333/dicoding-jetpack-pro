package com.unlistedi.academy.academy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.unlistedi.academy.R
import com.unlistedi.academy.utils.DataDummy
import kotlinx.android.synthetic.main.fragment_academy.*

/**
 * A simple [Fragment] subclass.
 */
class AcademyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val academyAdapter = activity?.let { AcademyAdapter(it) }
        academyAdapter?.courses = DataDummy.generateDummyCourses()

        rv_academy.layoutManager = LinearLayoutManager(context)
        rv_academy.setHasFixedSize(true)
        rv_academy.adapter = academyAdapter

        return inflater.inflate(R.layout.fragment_academy, container, false)
    }


}
