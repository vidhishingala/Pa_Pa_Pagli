package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class VegetableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetable)

        var vegetables = arrayOf("tomato","corn","carrot","raddish","potato","peas","onion","chilli","cabbage","brinjal","bottlegourd","bittergourd","pumpkin")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,vegetables)

        var gridview = findViewById<GridView>(R.id.gridview14)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, VegetableDetailActivity::class.java)
            intent.putExtra("vname",vegetables[i])
            startActivity(intent)
        }
    }
}