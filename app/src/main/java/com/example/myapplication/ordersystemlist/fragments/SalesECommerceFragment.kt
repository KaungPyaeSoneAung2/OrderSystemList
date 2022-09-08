package com.example.myapplication.ordersystemlist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.adapter.VoucherAdapter
import com.example.myapplication.ordersystemlist.data.VoucherModel
import com.example.myapplication.ordersystemlist.databinding.FragmentSalesECommerceBinding
import com.example.myapplication.ordersystemlist.databinding.FragmentSalesPosBinding


class SalesECommerceFragment : Fragment() {
    private lateinit var binding: FragmentSalesECommerceBinding
    var voucherList=ArrayList<VoucherModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSalesECommerceBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvAddVoucher()
        adapterSetUp()
        searchFilterFunction()
    }
    private fun searchFilterFunction() {
        binding.ivSearchButton.setOnClickListener {
            if (binding.etSearchButton.visibility==View.GONE){
                binding.etSearchButton.visibility=View.VISIBLE
            }
            else if (binding.etSearchButton.visibility==View.VISIBLE){
                binding.etSearchButton.visibility=View.GONE
            }
        }
        binding.etSearchButton.setBackgroundResource(R.drawable.search_border)

        binding.ivFilterButton.setOnClickListener {
            if (binding.clSpinnerList.visibility==View.GONE){
                binding.clSpinnerList.visibility=View.VISIBLE
            }
            else if (binding.clSpinnerList.visibility==View.VISIBLE){
                binding.clSpinnerList.visibility=View.GONE
            }
        }
    }

    private fun adapterSetUp() {
        binding.rvPosOrders.layoutManager= LinearLayoutManager(activity)
        binding.rvPosOrders.setHasFixedSize(true)
        val tempAdapter = VoucherAdapter(voucherList)
        binding.rvPosOrders.adapter=tempAdapter
    }

    fun rvAddVoucher(){
        voucherList.add(
            VoucherModel("#948500","Ordered",
            "Paid","KPay","15",
            "Kyaw Soe","54000",null)
        )
        voucherList.add(
            VoucherModel("#565455","Ordered",
            "Unpaid","AYABank","2",
            "Win Win","32000","+34")
        )
        voucherList.add(
            VoucherModel("#453454","Ordered",
            "Payment Rejected","Cash","1",
            "Toe Htay","7000","100")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
            "Payment Rejected","WavePay","100",
            "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
        voucherList.add(
            VoucherModel("#12345","Ordered",
                "Payment Rejected","WavePay","100",
                "Toe Aung","10000","+1000")
        )
    }

}