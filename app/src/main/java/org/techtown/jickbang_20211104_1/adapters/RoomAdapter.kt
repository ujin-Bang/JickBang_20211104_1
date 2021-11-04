package org.techtown.jickbang_20211104_1.adapters

import android.content.Context
import android.widget.ArrayAdapter
import org.techtown.jickbang_20211104_1.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>) : ArrayAdapter<RoomData>( mContext,resId,mList ) {
}