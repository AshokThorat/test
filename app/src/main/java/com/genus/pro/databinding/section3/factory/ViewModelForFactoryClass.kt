package com.genus.pro.databinding.section3.factory

import androidx.lifecycle.ViewModel

public class ViewModelForFactoryClass(startTotal:Int):ViewModel(){
    private var total=0
    init {
        total=startTotal
    }
    fun getTotal():Int
    {
        return total
    }
    fun setTotal(input:Int)
    {
        total=total+input
    }
}