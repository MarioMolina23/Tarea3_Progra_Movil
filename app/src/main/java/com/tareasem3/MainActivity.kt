package com.tareasem3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tareasem3.adapter.CampeonesAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerCampeonMundial)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CampeonesAdapter(CampeonesProvider.campeonesList)
    }
}