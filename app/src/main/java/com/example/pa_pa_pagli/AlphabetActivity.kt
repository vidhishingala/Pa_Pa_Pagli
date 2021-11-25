package com.example.pa_pa_pagli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView

class AlphabetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        var alpha = Array<String>(26){""}

        var j = 65

        for(i in 0..25)
        {
            alpha[i] = Character.toString(j.toChar())
            j++
        }

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,alpha)

        var gridview = findViewById<GridView>(R.id.gridview15)

        gridview.adapter = adapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, AlphabetDetailActivity::class.java)
            intent.putExtra("alphaname",alpha[i])
            startActivity(intent)
        }
    }
}