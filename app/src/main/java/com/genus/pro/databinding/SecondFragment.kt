package com.genus.pro.databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.genus.pro.databinding.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding:FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)

        val name= arguments?.getString("user_input")
        binding.textView.text=name

        return binding.root
    }

}