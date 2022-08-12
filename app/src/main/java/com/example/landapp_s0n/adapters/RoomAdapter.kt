package com.example.landapp_s0n.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.landapp_s0n.R
import com.example.landapp_s0n.datas.Room

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {  //Room데이터를 뿌려주기위한 어댑터

        val inflater = LayoutInflater.from(mContext)  //mContext화면을 기반으로 인플레이터 만들래.

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow =convertView
        if (tempRow==null){
            tempRow=inflater.inflate(R.layout.room_list_item, null)
        }

        var row=tempRow!!

        val roomData = mList[position]
        val priceTxt =row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt =row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt =row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text=roomData.description
        addressAndFloorTxt.text= "${roomData.address}, ${roomData.getFormattedFloor()}"

        return row


    }

}