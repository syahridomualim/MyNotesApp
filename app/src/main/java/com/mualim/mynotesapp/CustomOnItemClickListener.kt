package com.mualim.mynotesapp

import android.view.View
import android.widget.AdapterView

class CustomOnItemClickListener(private val position: Int, private val onItemClickCallback: OnItemClickCallback) : View.OnClickListener {

    override fun onClick(view: View?) {
        onItemClickCallback.onItemClicked(view!!, position)
    }

    interface OnItemClickCallback {
        fun onItemClicked(view: View, position: Int)
    }
}