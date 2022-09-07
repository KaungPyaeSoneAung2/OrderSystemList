package com.example.myapplication.ordersystemlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.SearchView
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.databinding.ActivitySalesPosBinding

class SalesPOSActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySalesPosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySalesPosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        filterFunction()
        searchFunction()


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


    fun useless(){
        //        var check=true
//        binding.ivSearchButton.setOnClickListener {
//            binding.tilSearch.visibility= View.VISIBLE
//            if (check==true){
//                binding.ivSearchButton.setImageResource(R.drawable.ic_close_24)
//                check=false
//            }
//            if(check==false){
//                binding.ivSearchButton.setImageResource(R.drawable.ic_search_24)
//                check=true
//            }
//        }
//        binding.etSearch.addTextChangedListener(object : TextWatcher{
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//
//            }
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                if (p0==""){
//                binding.ivSearchButton.setImageResource(R.drawable.ic_search_24)
//                }
//                else{
//                    binding.ivSearchButton.setImageResource(R.drawable.ic_close_24)
//                }
//            }
//            override fun afterTextChanged(p0: Editable?) {
//            }
//        })
//
    }
}