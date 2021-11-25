package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class FruitsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        var fruits = arrayOf("apple","cherry","grapes","mango","papaya","pineapple","banana","dragon","kiwi","orange","pear","pomegranate","strawberry","watermelon")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,fruits)

        var gridview = findViewById<GridView>(R.id.gridview4)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, FlowerDetailActivity::class.java)
            intent.putExtra("fruname",fruits[i])
            startActivity(intent)
        }
    }
}