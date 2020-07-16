package com.example.opencvjava

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class CvAdapter(private val cvArrayList: ArrayList<CV>) : RecyclerView.Adapter<CvHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CvHolder {
        return CvHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cv, parent, false))
    }

    override fun onBindViewHolder(holder: CvHolder, position: Int) {
        if (holder != null) {
            holder.txTittle.text = cvArrayList[position].title
            holder.txDescription.text = cvArrayList[position].description
        }
    }

    override fun getItemCount(): Int {
        return cvArrayList.size
    }
}