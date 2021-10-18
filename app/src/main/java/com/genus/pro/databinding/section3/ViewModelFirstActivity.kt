package com.genus.pro.databinding.section3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityViewModelFirstBinding

class ViewModelFirstActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewModelFirstBinding
    private lateinit var viewModel: ViewModelClassFirst
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model_first)

        viewModel=ViewModelProvider(this).get(ViewModelClassFirst::class.java)

        binding.showCountTextView.text=viewModel.getCurrentCount().toString()
        binding.showCountButton.setOnClickListener {
            binding.showCountTextView.text=viewModel.getUpdateCount().toString()
        }
    }
}