package com.genus.pro.databinding.section7

import android.graphics.Color
import android.graphics.Color.BLUE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_recycler_view)
        binding.let {

it.recyclerView.setBackgroundColor(Color.BLUE)
        }
    }
}