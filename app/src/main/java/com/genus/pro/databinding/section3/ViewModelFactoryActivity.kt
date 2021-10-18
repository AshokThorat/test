package com.genus.pro.databinding.section3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityViewModelFactoryBinding
import com.genus.pro.databinding.section3.factory.ViewModelFactory
import com.genus.pro.databinding.section3.factory.ViewModelForFactoryClass

class ViewModelFactoryActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewModelFactoryBinding
    lateinit var viewModel:ViewModelForFactoryClass
    lateinit var factory:ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_view_model_factory)

        factory= ViewModelFactory(100)
        viewModel=ViewModelProvider(this,factory).get(ViewModelForFactoryClass::class.java)

        binding.insertButton.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
            binding.resultTextView.text=viewModel.getTotal().toString()
        }

    }
}