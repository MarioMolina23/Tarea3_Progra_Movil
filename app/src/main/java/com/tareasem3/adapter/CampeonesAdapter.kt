package com.tareasem3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView;
import com.tareasem3.CampeonMundial
import com.tareasem3.R

class CampeonesAdapter(private val campeonesList:List<CampeonMundial>) : RecyclerView.Adapter<CampeonesViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampeonesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CampeonesViewHolder(layoutInflater.inflate(R.layout.item_campeon, parent, false))
    }

    override fun onBindViewHolder(holder: CampeonesViewHolder, position: Int) {
        val item = campeonesList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return campeonesList.size
    }
}