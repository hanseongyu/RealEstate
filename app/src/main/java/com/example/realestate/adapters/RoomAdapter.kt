package com.example.realestate.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.realestate.R
import com.example.realestate.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resId:Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext,resId,mList) {

        val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inflater.inflate(R.layout.room_list_item,null)
        }
        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val adressAndFloorTxt = row.findViewById<TextView>(R.id.adressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text = roomData.descrription
        adressAndFloorTxt.text = "${roomData.address}, ${roomData.getFormattedFloor()}"
        priceTxt.text = roomData.getFormattedPrice()

        return row
    }
}