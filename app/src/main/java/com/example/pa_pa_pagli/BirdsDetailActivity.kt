package com.example.pa_pa_pagli

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BirdsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birds_detail)

        var name = intent.getStringExtra("bname")!!.lowercase()

        var imageview = findViewById<ImageView>(R.id.imageView6)

        var id = resources.getIdentifier(name,"drawable",packageName)
        imageview.setImageResource(id)

        var mid = resources.getIdentifier(name,"raw",packageName)
        var mp = MediaPlayer.create(this,mid)
        mp.start()
    }
}