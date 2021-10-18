package com.genus.pro.databinding.select5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityTwoWayDataBindingBinding

class TwoWayDataBindingActivity : AppCompatActivity() {
   lateinit var binding: ActivityTwoWayDataBindingBinding
   lateinit var viewModel: TwoWayViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_way_data_binding)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_two_way_data_binding)

        viewModel = ViewModelProvider(this).get(TwoWayViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
/*
Two Way Data Binding vs One Way Data Binding

We can use one way data binding to show the user some data (app to user data flow).

And, we can also use one way data binding to get user input(user to app data flow) .

But, sometimes , we want to both show data and get user input over the same widget.

In other words, if we need a two-way data flow, we should use two-way data binding .

Simple Two Way Data Binding Project Example
Let’s start by creating a new Android Studio project. I am naming it  as TwoWayDataBinding demo.

Step 1
First of all we need to enable data binding in app level build.gradle file. Write this code part inside the android block.


*/