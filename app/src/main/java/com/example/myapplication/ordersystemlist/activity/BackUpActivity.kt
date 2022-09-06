package com.example.myapplication.ordersystemlist.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.ordersystemlist.databinding.ActivityBackUpBinding
import com.google.android.material.tabs.TabLayout

class BackUpActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBackUpBinding
    val tabLayout:TabLayout=binding.tabLayout
    val viewPager2:ViewPager2=binding.viewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBackUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tabLayout.addTab(tabLayout.newTab().setText("All"))
        tabLayout.addTab(tabLayout.newTab().setText("POS"))
        tabLayout.addTab(tabLayout.newTab().setText("Live"))
        tabLayout.addTab(tabLayout.newTab().setText("Online"))

        val fragmentManager:FragmentManager=supportFragmentManager

    }
}