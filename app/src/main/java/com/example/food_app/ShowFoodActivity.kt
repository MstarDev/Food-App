package com.example.food_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food_app.Cache.MySharedPreferance
import kotlinx.android.synthetic.main.activity_show_food.*

class ShowFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_food)
        supportActionBar?.hide()

        MySharedPreferance.init(this)

        val list = MySharedPreferance.ObjectString


        val position = intent.getIntExtra("position",0)
        txt_name.text = list[position].name
        txt_produts.text = list[position].products
        txt_taom_tayorlash.text = list[position].preparationOrder

    }
}