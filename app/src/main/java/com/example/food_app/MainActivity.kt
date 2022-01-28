package com.example.food_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btn_showFood.setOnClickListener {
            startActivity(Intent(this, FoodListActivity::class.java))
        }
        btn_AddFood.setOnClickListener {
            startActivity(Intent(this, Add_Food::class.java))
        }
    }
}