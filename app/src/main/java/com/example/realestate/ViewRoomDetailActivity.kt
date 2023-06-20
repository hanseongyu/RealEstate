package com.example.realestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realestate.databinding.ActivityViewRoomDetailBinding
import com.example.realestate.datas.Room

class ViewRoomDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityViewRoomDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewRoomDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val roomData = intent.getSerializableExtra("room") as Room

        binding.priceTxt.text = roomData.getFormattedPrice()
        binding.descriptionTxt.text = roomData.descrription
        binding.adressTxt.text = roomData.address
        binding.floorTxt.text = roomData.getFormattedFloor()

    }
}