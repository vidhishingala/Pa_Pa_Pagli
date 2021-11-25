package com.example.pa_pa_pagli

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FlowerDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower_detail)

        var name = intent.getStringExtra("fname")!!.lowercase()

        var imageview = findViewById<ImageView>(R.id.imageView4)

        var id = resources.getIdentifier(name,"drawable",packageName)
        imageview.setImageResource(id)

        var mid = resources.getIdentifier(name,"raw",packageName)
        var mp = MediaPlayer.create(this,mid)
        mp.start()
    }
}