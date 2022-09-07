package com.example.myapplication.ordersystemlist.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.ordersystemlist.activity.SalesAllActivity
import com.example.myapplication.ordersystemlist.fragments.SalesAllFragment
import com.example.myapplication.ordersystemlist.fragments.SalesLiveFragment

class MyFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return if (position == 1) {
            SalesAllFragment()
        } else SalesLiveFragment()
    }

    override fun getItemCount(): Int {
        return 2
    }
}