package com.genus.pro.databinding.section8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.genus.pro.databinding.R
import com.genus.pro.databinding.databinding.ActivityCoroutineDemo1Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CoroutineDemo1Activity : AppCompatActivity() {
    var count=0
    private lateinit var binding:ActivityCoroutineDemo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_coroutine_demo1)

        binding.btnCount.setOnClickListener {
            binding.tvCount.text = count++.toString()
        }
        binding.btnDownloadUserData.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {

                downloadMessage()
            }
        }
    }
    private suspend fun downloadMessage()
    {
        for(i in 1..200000)
        {
          withContext(Dispatchers.Main){
              binding.tvUserMessage.text="Downloading $i in ${Thread.currentThread().name}"

          }
        }
    }
}