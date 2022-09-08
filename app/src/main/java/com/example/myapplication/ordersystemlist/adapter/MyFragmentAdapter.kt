package com.example.myapplication.ordersystemlist.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.ordersystemlist.fragments.SalesECommerceFragment
import com.example.myapplication.ordersystemlist.fragments.SalesLiveFragment
import com.example.myapplication.ordersystemlist.fragments.SalesPosFragment

class MyFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0-> {
                SalesPosFragment()
            }
            1 -> {
                SalesLiveFragment()
            }
            else -> SalesECommerceFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}