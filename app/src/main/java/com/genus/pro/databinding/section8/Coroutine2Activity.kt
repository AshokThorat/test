package com.genus.pro.databinding.section8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.genus.pro.databinding.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Coroutine2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine2)
        CoroutineScope(Main).launch {
           Log.d("AshokThorat","calculation is start")
            val c1=async(IO) {  task1()}
            val c2= async(IO) { task2() }
            val c3=c1.await()+c2.await()
            Log.d("AshokThorat","Addition is $c3")

        }
    }
}
private suspend fun task1():Int{
    delay(10000)
    return 30000
}
private suspend fun task2():Int{
    delay(8000)
    return 40000
}