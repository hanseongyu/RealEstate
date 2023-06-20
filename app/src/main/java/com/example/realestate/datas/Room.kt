package com.example.realestate.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.Locale

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val descrription: String) : Serializable {

    fun getFormattedPrice():String{
        if (this.price >= 10000){
            val uk = this.price / 10000;
            val rest = this.price % 10000;
            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}원"

        }
        else{
            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}원"
        }
    }

    fun getFormattedFloor():String{
        if(this.floor >=1){
            return "${this.floor}층"
        }
        else if (this.floor == 0){
            return "반지하"
        }
        else{
            //-부호를 붙여 주면 반대로 연산한다.
            return "지하 ${-this.floor}층"
        }
    }



}