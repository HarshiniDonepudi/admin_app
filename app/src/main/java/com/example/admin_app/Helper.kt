package com.example.admin_app

data class Helper(
    var id: Int,
    var name:String,
    var spec: String,
    var about:String,
    var img_url:String,
    var exp:String,
    var avl: ArrayList<Int>,
    var timeslots: List<List<Int>>,
    var lang: String
)