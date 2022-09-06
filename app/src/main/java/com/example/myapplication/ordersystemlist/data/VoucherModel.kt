package com.example.myapplication.ordersystemlist.data

data class VoucherModel(
    var orderNumber:String,
    var orderCondition:String,
    var paymentCondition:String,
    var paymentMethod:String,
    var itemAmount:String,
    var buyer:String,
    var price:String,
    var pointGain:String?
)
