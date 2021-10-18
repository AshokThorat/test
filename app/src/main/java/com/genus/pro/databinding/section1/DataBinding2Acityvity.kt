package com.genus.pro.databinding.section1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityDataBinding2AcityvityBinding

class DataBinding2Acityvity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding2AcityvityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_data_binding2_acityvity)

        binding.student=getStudent()


    }
    fun getStudent(): Student
    {
        return Student(101,"Ashok","ashokmthorat");
    }
}