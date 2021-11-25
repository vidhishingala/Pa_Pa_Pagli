package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class BirdsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birds)

        var birds = arrayOf("dove","kite","ostrich","pigeon","rooster","sparrow","crow","duck","flamingo","owl","parrot","peacock")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,birds)

        var gridview = findViewById<GridView>(R.id.gridview2)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, BirdsDetailActivity::class.java)
            intent.putExtra("bname",birds[i])
            startActivity(intent)
        }
    }
}