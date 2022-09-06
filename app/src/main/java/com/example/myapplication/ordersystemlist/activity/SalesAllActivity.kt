package com.example.myapplication.ordersystemlist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.adapter.VoucherAdapter
import com.example.myapplication.ordersystemlist.data.VoucherModel
import com.example.myapplication.ordersystemlist.databinding.ActivitySalesAllBinding

class SalesAllActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySalesAllBinding
    var voucherList=ArrayList<VoucherModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySalesAllBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rvAddVoucher()
        adapterSetUp()
    }

    private fun adapterSetUp() {
        binding.rvVouchers.layoutManager=LinearLayoutManager(this)
        binding.rvVouchers.setHasFixedSize(true)
        val tempAdapter = VoucherAdapter(voucherList)
        binding.rvVouchers.adapter=tempAdapter
    }

    fun rvAddVoucher(){
        voucherList.add(VoucherModel("#948500","Ordered",
            "Paid","KPay","15",
            "Kyaw Soe","54000",null))
        voucherList.add(VoucherModel("#565455","Ordered",
            "Unpaid","AYABank","2",
            "Win Win","32000","+34"))
        voucherList.add(VoucherModel("#453454","Ordered",
            "Payment Rejected","Cash","1",
            "Toe Htay","7000","100"))
        voucherList.add(VoucherModel("#12345","Ordered",
            "Payment Rejected","WavePay","100",
            "Toe Aung","10000","+1000"))
    }
}