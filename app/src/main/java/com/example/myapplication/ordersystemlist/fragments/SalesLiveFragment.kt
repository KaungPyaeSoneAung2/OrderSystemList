package com.example.myapplication.ordersystemlist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.adapter.LiveSaleAdapter
import com.example.myapplication.ordersystemlist.data.LiveNotiModel
import com.example.myapplication.ordersystemlist.data.VoucherModel
import com.example.myapplication.ordersystemlist.databinding.FragmentSalesLiveBinding


class SalesLiveFragment : Fragment() {
    private lateinit var binding: FragmentSalesLiveBinding
    var voucherSmall=ArrayList<VoucherModel>()
    var voucherTemp1=ArrayList<VoucherModel>()
    var voucherTemp2=ArrayList<VoucherModel>()
    var liveList=ArrayList<LiveNotiModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentSalesLiveBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvAddVoucher()
        rvAddLive()
        adapterSetUp()
        searchFunction()
    }

    private fun adapterSetUp() {
        binding.rvLiveSale.layoutManager= LinearLayoutManager(activity)
        binding.rvLiveSale.setHasFixedSize(true)
        val tempAdapter = LiveSaleAdapter(liveList)
        binding.rvLiveSale.adapter=tempAdapter
    }

    fun rvAddLive(){
        voucherTemp1.add(voucherSmall[0])
        voucherTemp1.add(voucherSmall[2])
        liveList.add(
            LiveNotiModel("Hello We are selling goods with good price",
        "Live ended at 10 Jan 2022 5:30 PM","100 orders",voucherTemp1)
        )
        voucherTemp2.add(voucherSmall[1])
        voucherTemp2.add(voucherSmall[2])
        voucherTemp2.add(voucherSmall[4])
        voucherTemp2.add(voucherSmall[3])
        liveList.add(
            LiveNotiModel("Yooo Come buy with us",
                "Live ended at 11 Jan 2022 5:33 PM","210 orders",voucherTemp2)
        )
    }

    fun rvAddVoucher(){
        voucherSmall.add(VoucherModel("#948500","Ordered",
            "Paid","KPay","15",
            "Kyaw Soe","54000",null))
        voucherSmall.add(VoucherModel("#565455","Ordered",
            "Unpaid","AYABank","2",
            "Win Win","32000","+34"))
        voucherSmall.add(VoucherModel("#453454","Ordered",
            "Payment Rejected","Cash","1",
            "Toe Htay","7000","100"))
        voucherSmall.add(VoucherModel("#12345","Ordered",
            "Payment Rejected","WavePay","100",
            "Toe Aung","10000","+1000"))
        voucherSmall.add(VoucherModel("#62345","Ordered",
            "Unpaid","Cash","270",
            "Toe Kyaw","50000","1000"))
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
}