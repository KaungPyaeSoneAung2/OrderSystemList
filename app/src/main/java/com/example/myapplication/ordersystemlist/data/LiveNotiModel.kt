package com.example.myapplication.ordersystemlist.data

data class LiveNotiModel (
    val caption:String,
    val time:String,
    val orderAmount:String,
    val vouchers:List<VoucherModel>
        )