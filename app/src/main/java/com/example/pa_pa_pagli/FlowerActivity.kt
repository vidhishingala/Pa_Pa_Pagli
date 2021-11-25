package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridLayout
import android.widget.GridView
import android.widget.ListView

class FlowerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)

        var flowers = arrayOf("aster","blue_hibiscus","bougainvillea","daisy","dhutra","fox_brush_orchid","indian_lotus","iris","jasmine","lavender","marigold","morning_glory","pansy","periwinkle","plumeria","rose","siroi_lily","sunflower","tulip")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,flowers)

        var gridview = findViewById<GridView>(R.id.gridview)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, FlowerDetailActivity::class.java)
            intent.putExtra("fname",flowers[i])
            startActivity(intent)
        }
    }
}