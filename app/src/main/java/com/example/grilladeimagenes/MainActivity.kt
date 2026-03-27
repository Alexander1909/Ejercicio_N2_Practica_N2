package com.example.grilladeimagenes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private lateinit var gridView: GridView

    private val pizzas = arrayOf(
        "Margarita",
        "Pepperoni",
        "Hawaiana",
        "Cuatro Quesos",
        "Vegetariana",
        "BBQ"
    )

    private val imagenes = intArrayOf(
        R.drawable.margarita,
        R.drawable.pepperoni,
        R.drawable.hawaiana,
        R.drawable.cuatro_quesos,
        R.drawable.vegetariana,
        R.drawable.bbq
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        val adapter = PizzaAdapter(this, pizzas, imagenes)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Pizza: ${pizzas[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}