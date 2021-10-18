package com.genus.pro.databinding.section3

import androidx.lifecycle.ViewModel

class ViewModelClassFirst:ViewModel() {
    private var count=0
    fun getCurrentCount():Int
    {
        return  count
    }
    fun getUpdateCount():Int{
        count++
        return count
    }
}