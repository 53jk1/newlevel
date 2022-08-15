package com.example.newlevel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MojAdapter() : RecyclerView.Adapter<MojVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MojVH {
        val layoutInflater = LayoutInflater.from(parent.context)

        val crow = layoutInflater.inflate(R.layout.layoucik, parent,false)
        return MojVH(crow)
    }

    override fun getItemCount(): Int {
        return Kontakty.ludzie.size
    }

    override fun onBindViewHolder(holder: MojVH, position: Int) {

        val imie = holder.widok.findViewById<TextView>(R.id.showname)
        val numer = holder.widok.findViewById<TextView>(R.id.shownumber)

        imie.setText(Kontakty.ludzie[position].imieinaz)
        numer.setText(Kontakty.ludzie[position].numertel)

    }
}
class MojVH (val widok: View) : RecyclerView.ViewHolder(widok){}