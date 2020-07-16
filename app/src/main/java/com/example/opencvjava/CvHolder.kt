package com.example.opencvjava

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CvHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var txTittle: TextView = itemView.findViewById(R.id.tx_title)

    @JvmField
    var txDescription: TextView = itemView.findViewById(R.id.tx_description)

}