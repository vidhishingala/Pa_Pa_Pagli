package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class AnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        var animals = arrayOf("alligator","deer","elephant","giraffe","leopard","lion","monkey","rabbit","snake","tiger","wolf","zeebra")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,animals)

        var gridview = findViewById<GridView>(R.id.gridview1)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, AnimalDetailActivity::class.java)
            intent.putExtra("aname",animals[i])
            startActivity(intent)
        }
    }
}