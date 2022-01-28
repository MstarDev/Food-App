package com.example.food_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food_app.Adapter.MyAdapter
import com.example.food_app.Cache.MySharedPreferance
import kotlinx.android.synthetic.main.activity_food_list.*

class FoodListActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)
        title = "Barcha taomlar"

        MySharedPreferance.init(this)

        val list = MySharedPreferance.ObjectString

        myAdapter = MyAdapter(this ,list)
        list_food.adapter = myAdapter

        list_food.setOnItemClickListener{ parent, view, position, id ->
            val intent = Intent(this,ShowFoodActivity::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }

    }
}