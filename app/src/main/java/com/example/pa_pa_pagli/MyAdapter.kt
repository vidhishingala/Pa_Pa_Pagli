package com.example.pa_pa_pagli

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import android.content.Intent as Intent

class MyAdapter(): RecyclerView.Adapter<MyAdapter.MyHolder>() {

    var vimage_data = arrayOf(R.drawable.flowers,R.drawable.alphabets,R.drawable.numbers,R.drawable.animals,R.drawable.birds)
    var vname_data = arrayOf("Flowers","Alphabets","Numbers","Animals","Birds")

    var vimage_data2 = arrayOf(R.drawable.fruits,R.drawable.vegetables,R.drawable.months,R.drawable.weeks,R.drawable.myfamily)
    var vname_data2 = arrayOf("Fruits","Vegetables","Months","Weeks","My Family")

    lateinit var context : Context
    constructor(context:Context) : this() {
        this.context = context
    }

    inner class MyHolder(view: View):RecyclerView.ViewHolder(view){
        var vimage : ImageView
        var vimage2 : ImageView


        init {
            vimage = view.findViewById(R.id.imageView)
            vimage2 = view.findViewById(R.id.imageView2)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.vimage.setImageResource(vimage_data[position])
        holder.vimage2.setImageResource(vimage_data2[position])


        holder.vimage.setOnClickListener {
            when (position) {
                0 -> {
                    var intent = Intent(context,FlowerActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                1 -> {
                    var intent = Intent(context,FlowerActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                2 -> {
                    var intent = Intent(context,FlowerActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                3 -> {
                    var intent = Intent(context,AnimalActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                4 -> {
                    var intent = Intent(context,BirdsActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
            }
        }

        holder.vimage2.setOnClickListener {
            when (position) {
                0 -> {
                    var intent = Intent(context,FruitsActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                1 -> {
                    var intent = Intent(context,FlowerActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                2 -> {
                    var intent = Intent(context,FlowerActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                3 -> {
                    var intent = Intent(context,FlowerActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
                4 -> {
                    var intent = Intent(context,FamilyActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return vname_data.size
    }

}
