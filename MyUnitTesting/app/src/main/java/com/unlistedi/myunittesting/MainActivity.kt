package com.unlistedi.myunittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = MainViewModel(CuboidModel())

        btn_save.setOnClickListener {
            val length = edt_length.text.toString().trim()
            val width = edt_width.text.toString().trim()
            val height = edt_height.text.toString().trim()

            when {
                TextUtils.isEmpty(length) -> {
                    edt_length.error = "Field ini tidak boleh kosong"
                }
                TextUtils.isEmpty(width) -> {
                    edt_width.error = "Field ini tidak boleh kosong"
                }
                TextUtils.isEmpty(height) -> {
                    edt_height.error = "Field ini tidak boleh kosong"
                }
                else -> {
                    val l = length.toDouble()
                    val w = width.toDouble()
                    val h = height.toDouble()

                    mainViewModel.save(l, w, h)
                    visible()

                    btn_calculate_circumference.setOnClickListener {
                        tv_result.text = mainViewModel.getCircumference().toString()
                        gone()
                    }
                    btn_calculate_surface_area.setOnClickListener {
                        tv_result.text = mainViewModel.getSurfaceArea().toString()
                        gone()
                    }
                    btn_calculate_volume.setOnClickListener {
                        tv_result.text = mainViewModel.getVolume().toString()
                        gone()
                    }

                }
            }
        }
    }

    private fun visible(){
        btn_calculate_volume.visibility = View.VISIBLE
        btn_calculate_circumference.visibility = View.VISIBLE
        btn_calculate_surface_area.visibility = View.VISIBLE
        btn_save.visibility = View.GONE
    }

    private fun gone(){
        btn_calculate_volume.visibility = View.GONE
        btn_calculate_circumference.visibility = View.GONE
        btn_calculate_surface_area.visibility = View.GONE
        btn_save.visibility = View.VISIBLE
    }

}
