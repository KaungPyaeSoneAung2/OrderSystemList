package com.example.myapplication.ordersystemlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ordersystemlist.data.LiveNotiModel
import com.example.myapplication.ordersystemlist.data.VoucherModel
import com.example.myapplication.ordersystemlist.databinding.ItemLiveSaleBinding

class LiveSaleAdapter (val liveLayout:List<LiveNotiModel>)
    :RecyclerView.Adapter<LiveSaleAdapter.ListHolder>() {
    inner class ListHolder(private val binding: ItemLiveSaleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(liveLayout: LiveNotiModel){
            val voucherAdapter=VoucherAdapter(liveLayout.vouchers)
            binding.rvVoucherList.adapter=voucherAdapter
            binding.tvLiveTime.text=liveLayout.time
            binding.tvCaption.text=liveLayout.caption
            binding.tvOrderAmount.text=liveLayout.orderAmount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        return (ListHolder(ItemLiveSaleBinding.inflate(LayoutInflater.from(parent.context),parent,false)))
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(liveLayout[position])
    }

    override fun getItemCount(): Int =liveLayout.size
}