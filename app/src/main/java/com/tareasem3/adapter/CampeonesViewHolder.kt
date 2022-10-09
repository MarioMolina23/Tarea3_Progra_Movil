package com.tareasem3.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tareasem3.CampeonMundial
import com.tareasem3.R

class CampeonesViewHolder(view:View):RecyclerView.ViewHolder(view){

    val campeon = view.findViewById<TextView>(R.id.tvCampeonName)
    val ano = view.findViewById<TextView>(R.id.tvAno)
    val mundial = view.findViewById<TextView>(R.id.tvMundial)
    val foto = view.findViewById<ImageView>(R.id.ivCampeon)

    fun render (campeonMundial: CampeonMundial){
        campeon.text = campeonMundial.campeon
        ano.text = campeonMundial.ano
        mundial.text = campeonMundial.mundial
        Glide.with(foto.context).load(campeonMundial.foto).into(foto)
    }
}