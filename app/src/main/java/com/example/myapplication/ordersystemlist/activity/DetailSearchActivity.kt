package com.example.myapplication.ordersystemlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.databinding.ActivityDetailSearchBinding

class DetailSearchActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailSearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }
    fun onClick(){

        binding.ivClose.setOnClickListener {
            onBackPressed()
        }
        binding.clTimeCatch.setOnClickListener{
            if (binding.radioGroup.visibility== View.VISIBLE){
                binding.radioGroup.visibility= View.GONE
            }
            else if (binding.radioGroup.visibility== View.GONE){
                binding.radioGroup.visibility= View.VISIBLE
            }
        }

        binding.clOrderConditionCatch.setOnClickListener {
            if (binding.cgOrderCondition.visibility== View.VISIBLE){
                binding.cgOrderCondition.visibility= View.GONE
            }
            else if (binding.cgOrderCondition.visibility== View.GONE){
                binding.cgOrderCondition.visibility= View.VISIBLE
            }
        }
        binding.clPaymentConditionCatch.setOnClickListener {
            if (binding.cgPaymentCondition.visibility== View.VISIBLE){
                binding.cgPaymentCondition.visibility= View.GONE
            }
            else if (binding.cgPaymentCondition.visibility== View.GONE){
                binding.cgPaymentCondition.visibility= View.VISIBLE
            }
        }
        binding.clPaymentPlace.setOnClickListener {
            if (binding.cgPaymentPlace.visibility== View.VISIBLE){
                binding.cgPaymentPlace.visibility= View.GONE
            }
            else if (binding.cgPaymentPlace.visibility== View.GONE){
                binding.cgPaymentPlace.visibility= View.VISIBLE
            }
        }
        binding.clOrderPlacce.setOnClickListener {
            if (binding.tilOrderPlaceSearch.visibility== View.VISIBLE){
                binding.tilOrderPlaceSearch.visibility= View.GONE
                binding.rvSearchResults.visibility=View.GONE
            }
            else if (binding.tilOrderPlaceSearch.visibility== View.GONE){
                binding.tilOrderPlaceSearch.visibility= View.VISIBLE
                binding.rvSearchResults.visibility=View.VISIBLE
            }
        }

    }
}