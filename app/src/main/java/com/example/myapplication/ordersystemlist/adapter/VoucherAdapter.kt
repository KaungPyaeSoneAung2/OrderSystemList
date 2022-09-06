package com.example.myapplication.ordersystemlist.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ordersystemlist.R
import com.example.myapplication.ordersystemlist.data.VoucherModel
import com.example.myapplication.ordersystemlist.databinding.ItemBuyListBinding

class VoucherAdapter(private val voucherLayout:List<VoucherModel>)
    : RecyclerView.Adapter<VoucherAdapter.ListHolder>() {

    inner class ListHolder(private val binding: ItemBuyListBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(voucherLayout: VoucherModel){
            binding.tvOrderNumber.text=voucherLayout.orderNumber
            binding.tvPaidUnpaid.text=voucherLayout.paymentCondition
            binding.tvOrderCondition.text=voucherLayout.orderCondition
            binding.tvPaymentMethod.text=voucherLayout.paymentMethod
            binding.tvOrderAmount.text=voucherLayout.itemAmount
            if (voucherLayout.itemAmount.toInt()==1){
                binding.tvItemsby.text=" item by "
            }

            binding.tvOrderCustomerNam.text=voucherLayout.buyer
            binding.tvOrderCost.text=voucherLayout.price
            when(voucherLayout.paymentCondition){
                "Paid"-> binding.viSideColor.setBackgroundColor(Color.parseColor("#3554E1"))
                "Unpaid"->binding.viSideColor.setBackgroundColor(Color.parseColor("#FFB000"))
                "Payment Rejected"->binding.viSideColor.setBackgroundColor(Color.RED)
            }

            if (voucherLayout.pointGain==null){
                    binding.tvOrderPointGain.isVisible = false
                    binding.tvOrderPointAlready.isVisible=false
            }

            else{
                val pointArray=voucherLayout.pointGain!!.toCharArray()
                if (pointArray[0]=='+'){
                    binding.tvOrderPointGain.text=voucherLayout.pointGain+" Points"
                    binding.tvOrderPointGain.isVisible = true
                    binding.tvOrderPointAlready.isVisible=false
                }
                else if (pointArray[0]!='0'){
                    binding.tvOrderPointAlready.text=voucherLayout.pointGain+" Points"
                    binding.tvOrderPointGain.isVisible = false
                    binding.tvOrderPointAlready.isVisible=true
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        return (ListHolder(ItemBuyListBinding.inflate(LayoutInflater.from(parent.context),parent,false)))
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(voucherLayout[position])
    }

    override fun getItemCount(): Int {
        return voucherLayout.size
    }

}