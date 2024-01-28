package com.examen.kotlinandroidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.examen.kotlinandroidsample.databinding.ActivityCountBinding

class CountActivity : AppCompatActivity() {
    private lateinit var activityCountBinding: ActivityCountBinding
    private var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityCountBinding = DataBindingUtil.setContentView(this, R.layout.activity_count)
        activityCountBinding.submitCount.setOnClickListener{
            count++
            activityCountBinding.textView.text = count.toString()
        }
    }
}