package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)

        var family = arrayOf("fahter","mother","brother","sister","grandfather","grandmother","uncle","aunt")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,family)

        var gridview = findViewById<GridView>(R.id.gridview3)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, FamilyDetailActivity::class.java)
            intent.putExtra("f1name",family[i])
            startActivity(intent)
        }
    }
}