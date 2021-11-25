package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        var numbers = arrayOf("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Two")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,numbers)

        var gridview = findViewById<GridView>(R.id.gridview13)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, NumberDetailActivity::class.java)
            intent.putExtra("numname",numbers[i])
            startActivity(intent)
        }
    }
}