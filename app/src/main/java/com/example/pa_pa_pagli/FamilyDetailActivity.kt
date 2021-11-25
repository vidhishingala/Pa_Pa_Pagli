package com.example.pa_pa_pagli

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FamilyDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_detail)

        var name = intent.getStringExtra("f1name")!!.lowercase()

        var imageview = findViewById<ImageView>(R.id.imageView7)

        var id = resources.getIdentifier(name,"drawable",packageName)
        imageview.setImageResource(id)

        var mid = resources.getIdentifier(name,"raw",packageName)
        var mp = MediaPlayer.create(this,mid)
        mp.start()
    }
}