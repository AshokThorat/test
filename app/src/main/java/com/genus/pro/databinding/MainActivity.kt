package com.genus.pro.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.genus.pro.databinding.databinding.ActivityMainBinding
import com.genus.pro.databinding.section1.DataBinding2Acityvity
import com.genus.pro.databinding.section1.DataBindingFirstActivity
import com.genus.pro.databinding.section3.ViewModelFactoryActivity
import com.genus.pro.databinding.section3.ViewModelFirstActivity
import com.genus.pro.databinding.section6.NavigationActivity
import com.genus.pro.databinding.section7.RecyclerViewActivity
import com.genus.pro.databinding.section8.Coroutine2Activity
import com.genus.pro.databinding.section8.CoroutineDemo1Activity
import com.genus.pro.databinding.select5.TwoWayDataBindingActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val list= arrayListOf<String>("Simple data binding",
        "Data Binding using model class",
        "Simple View Model ",
        "View Model with Factory",
        "Two way data binding",
        "Navigation fragment",
        "Recycler view ",
        "Coroutine first ",
        "Coroutine Second "





    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val adpater = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list)


        binding.run {

            mainListView.adapter = adpater
            mainListView.onItemClickListener =
                AdapterView.OnItemClickListener { parent, view, position, id ->

                    if(position==0)
                    {
                        val intent= Intent(this@MainActivity, DataBindingFirstActivity::class.java)
                        startActivity(intent)
                    }
                    else if(position==1)
                    {
                        val intent= Intent(this@MainActivity, DataBinding2Acityvity::class.java)
                        startActivity(intent)
                    }
                    else if(position==2)
                    {
                        val intent= Intent(this@MainActivity, ViewModelFirstActivity::class.java)
                        startActivity(intent)
                    }
                    else if(position==3)
                    {
                        val intent= Intent(this@MainActivity, ViewModelFactoryActivity::class.java)
                        startActivity(intent)
                    }
                    else if(position==4)
                    {
                        val intent= Intent(this@MainActivity, TwoWayDataBindingActivity::class.java)
                        startActivity(intent)
                    }
                    else if(position==5)
                    {
                        val intent= Intent(this@MainActivity, NavigationActivity::class.java)
                        startActivity(intent)
                    }
                    else if(position==6)
                    {
                        val intent= Intent(this@MainActivity, RecyclerViewActivity::class.java)
                        startActivity(intent)
                    }
                    else if(position==7)
                    {
                        val intent= Intent(this@MainActivity, CoroutineDemo1Activity::class.java)
                        startActivity(intent)
                    }
                    else if(position==8)
                    {
                        val intent= Intent(this@MainActivity, Coroutine2Activity::class.java)
                        startActivity(intent)
                    }
                }


        }
    }

}