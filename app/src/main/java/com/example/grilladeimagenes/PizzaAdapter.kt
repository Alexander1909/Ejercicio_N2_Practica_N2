package com.example.grilladeimagenes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PizzaAdapter(private val context: Context, private val nombres: Array<String>, private val imagenes: IntArray) : BaseAdapter() {

    override fun getCount(): Int = nombres.size

    override fun getItem(position: Int): Any = nombres[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false)

        val imgPizza = view.findViewById<ImageView>(R.id.imgPizza)
        val txtPizza = view.findViewById<TextView>(R.id.txtPizza)

        imgPizza.setImageResource(imagenes[position])
        txtPizza.text = nombres[position]

        return view
    }
}
