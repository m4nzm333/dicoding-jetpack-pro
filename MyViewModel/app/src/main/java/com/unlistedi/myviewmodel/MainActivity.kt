package com.unlistedi.myviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        displayResult()

        btn_calculate.setOnClickListener {
            val width = edt_width.text.toString()
            val height = edt_height.text.toString()
            val length = edt_length.text.toString()

            when {
                width.isEmpty() -> {
                    edt_width.error = "Masih kosong"
                }
                height.isEmpty() -> {
                    edt_height.error = "Masih kosong"
                }
                length.isEmpty() -> {
                    edt_length.error = "Masih kosong"
                }
                else -> {
                    mainViewModel.calculate(width, height,  length)
                    displayResult()
                }
            }
        }
    }

    fun displayResult(){
        tv_result.text = mainViewModel.result.toString()
    }
}
