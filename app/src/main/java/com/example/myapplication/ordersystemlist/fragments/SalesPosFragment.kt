package com.example.myapplication.ordersystemlist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.databinding.FragmentSalesPosBinding

class SalesPosFragment : Fragment() {
    private lateinit var binding:FragmentSalesPosBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSalesPosBinding.inflate(layoutInflater)
        filterFunction()
        searchFunction()
        return binding.root
    }
    private fun searchFunction() {
        binding.ivSearchButton.setOnClickListener {
            if (binding.etSearchButton.visibility==View.GONE){
                binding.etSearchButton.visibility=View.VISIBLE
            }
            else if (binding.etSearchButton.visibility==View.VISIBLE){
                binding.etSearchButton.visibility=View.GONE
            }
        }
        binding.etSearchButton.setBackgroundResource(R.drawable.search_border)
    }
    private fun filterFunction() {
        binding.ivFilterButton.setOnClickListener {
            if (binding.clSpinnerList.visibility==View.GONE){
                binding.clSpinnerList.visibility=View.VISIBLE
            }
            else if (binding.clSpinnerList.visibility==View.VISIBLE){
                binding.clSpinnerList.visibility=View.GONE
            }
        }
    }
}