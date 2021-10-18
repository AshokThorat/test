package com.genus.pro.databinding.section1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityDataBindingFirstBinding

class DataBindingFirstActivity : AppCompatActivity() {
    lateinit var binding:ActivityDataBindingFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_data_binding_first)

        binding.sumbitButton.setOnClickListener {

            show()

        }
    }
    fun show()
    {
        binding.showTextView.text="Hello ${binding.nameEditText.text}"
        binding.nameEditText.setText("")
    }

}