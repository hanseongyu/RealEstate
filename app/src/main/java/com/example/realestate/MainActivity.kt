package com.example.realestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realestate.adapters.RoomAdapter
import com.example.realestate.databinding.ActivityMainBinding
import com.example.realestate.datas.Room

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val mRoomList = ArrayList<Room>()
    lateinit var mRoomAdapter: RoomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mRoomList.add(Room(7500,"서울시 동대문구",8,"서울시 동대문구의 8층 7500만원 방 입니다."))
        mRoomList.add(Room(17500,"서울시 서대문구",0,"서울시 서대문구 반지하 17500만원 방 입니다."))
        mRoomList.add(Room(9500,"서울시 강남구",0,"서울시 강남구 반지하 9500만원 방 입니다."))
        mRoomList.add(Room(27500,"서울시 은평구",-2,"서울시 은평구 지하 2층 27500만원 방 입니다."))
        mRoomList.add(Room(37500,"서울시 역삼구",5,"서울시 역삼구 5층 37500만원 방 입니다."))
        mRoomList.add(Room(12500,"서울시 동구",7,"서울시 동구 7층 12500만원 방 입니다."))
        mRoomList.add(Room(77500,"서울시 서구",18,"서울시 서구 18층 77500만원 방 입니다."))
        mRoomList.add(Room(19500,"서울시 남구",-1,"서울시 남구 지하 1층 19500만원 방 입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        binding.roomListview.adapter = mRoomAdapter

    }
}