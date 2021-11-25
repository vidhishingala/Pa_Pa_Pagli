package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class MonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month)

        var months = arrayOf("January","February","March","April","May","June","July","August","September","October","November","December")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,months)

        var gridview = findViewById<GridView>(R.id.gridview12)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, MonthDetailActivity::class.java)
            intent.putExtra("mname",months[i])
            startActivity(intent)
        }
    }
}