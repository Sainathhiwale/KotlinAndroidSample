package com.examen.kotlinandroidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.examen.kotlinandroidsample.databinding.ActivityChalleageDbactivityBinding

class ChalleageDBActivity : AppCompatActivity(), View.OnClickListener {
    // auto create the data binding object based on layout file
    private lateinit var binding: ActivityChalleageDbactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // init the data binding object the DataBindingUtil.setContentView method is used to set the content view of the activity and create the binding object.
        binding = DataBindingUtil.setContentView(this,R.layout.activity_challeage_dbactivity)
        //setContentView(R.layout.activity_challeage_dbactivity)
        initView()
    }

    private fun initView() {
        binding.submitButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.submit_Button){
            startorStopProgressBar()
        }
    }

    private fun startorStopProgressBar() {
        binding.apply {
            if (progressBar.visibility== View.GONE){
                progressBar.visibility = View.VISIBLE
                submitButton.text = "Stop"
            }else{
                progressBar.visibility = View.GONE
                submitButton.text = "Start"
            }
        }

    }
}