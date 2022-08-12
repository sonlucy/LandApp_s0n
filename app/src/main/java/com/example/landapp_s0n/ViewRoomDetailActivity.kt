package com.example.landapp_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp_s0n.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

// / 데이터 받기
        /////Serializable을 room형태로 변환하기위해 casting해주기 (as사용)
        val roomData = intent.getSerializableExtra("room") as Room

        priceTxt.text = roomData.getFormattedPrice()
        descriptionTxt.text = roomData.description
        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFormattedFloor()


    }
}