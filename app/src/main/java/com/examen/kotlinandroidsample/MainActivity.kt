package com.examen.kotlinandroidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.examen.kotlinandroidsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initView()
    }

    private fun initView() {
        activityMainBinding.submitButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.submit_Button){
           displayMessage()
        }
    }

    private fun displayMessage() {
        activityMainBinding.textView.text = "Welcome:" + activityMainBinding.editText.text
    }
}