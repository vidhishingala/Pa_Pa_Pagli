package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class WeekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week)

        var weeks = arrayOf("sunday","monday","tuesday","wednesday","thursday","friday","saturday")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,weeks)

        var gridview = findViewById<GridView>(R.id.gridview11)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, WeekDetailActivity::class.java)
            intent.putExtra("wname",weeks[i])
            startActivity(intent)
        }
    }
}