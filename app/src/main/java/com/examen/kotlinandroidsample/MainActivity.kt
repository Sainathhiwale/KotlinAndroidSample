package com.examen.kotlinandroidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examen.kotlinandroidsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var activityMainBinding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityMainBinding!!.root
        setContentView(view)*/
    }
}