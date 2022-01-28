package com.example.food_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.food_app.Cache.MySharedPreferance
import com.example.food_app.Models.Food

import kotlinx.android.synthetic.main.activity_add_food.*
import kotlinx.android.synthetic.main.activity_show_food.*

class Add_Food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
        title = "Taom qo'shish"

        MySharedPreferance.init(this)


        btn_save.setOnClickListener {
            val name = food_name.text.toString().trim()
            val products = mahsulot.text.toString().trim()
            val  preparationOrder = tayorlash.text.toString().trim()

            if (name!="" && products!="" && preparationOrder!=""){
                val list = MySharedPreferance.ObjectString
                list.add(Food(name, products, preparationOrder))
                MySharedPreferance.ObjectString = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Ma'lumot yetarli emas!!!", Toast.LENGTH_SHORT).show()
            }



        }

    }
}