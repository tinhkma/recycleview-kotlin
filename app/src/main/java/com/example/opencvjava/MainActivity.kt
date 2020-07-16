package com.example.opencvjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opencvjava.R2.id.rv_cv
import java.util.*

class MainActivity : AppCompatActivity() {
    var adapter: CvAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cvArrayList = ArrayList<CV>()
        val recyclerView = findViewById(R.id.rv_cv) as RecyclerView
        cvArrayList.add(CV("bogia", "do la tac pham hay"))
        cvArrayList.add(CV("bogia", "do la tac pham hay"))
        cvArrayList.add(CV("bogia", "do la tac pham hay"))
        cvArrayList.add(CV("bogia", "do la tac pham hay"))
        cvArrayList.add(CV("bogia", "do la tac pham hay"))
        adapter = CvAdapter(cvArrayList)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = CvAdapter(cvArrayList)
    }
}