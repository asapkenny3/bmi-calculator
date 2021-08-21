package com.calculator.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() /100
            val w = weight.text.toString().toFloat()
            val res = w/(h*h)
            res.text = "%.2f".format(res)
        }
    }
}