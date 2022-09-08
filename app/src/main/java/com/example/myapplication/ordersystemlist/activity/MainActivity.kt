package com.example.myapplication.ordersystemlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.adapter.MyFragmentAdapter
import com.example.myapplication.ordersystemlist.databinding.ActivityBackUpBinding
import com.example.myapplication.ordersystemlist.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var tabLayout:TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        TabChangeManage()
    }
    fun TabChangeManage(){
        val viewPager2: ViewPager2 =binding.viewPager2
        tabLayout = findViewById(R.id.tabLayout)

        tabLayout.addTab(tabLayout.newTab().setText("POS"))
        tabLayout.addTab(tabLayout.newTab().setText("Live sale"))
        tabLayout.addTab(tabLayout.newTab().setText("eCommerce"))
        //tabLayout.addTab(tabLayout.newTab().setText("Online"))


        val fragmentManager: FragmentManager =supportFragmentManager
        val fragmentAdapter= MyFragmentAdapter(fragmentManager , lifecycle)
        viewPager2.adapter = fragmentAdapter

        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager2.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }
}