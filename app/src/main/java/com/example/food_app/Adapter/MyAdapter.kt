package com.example.food_app.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.food_app.Models.Food
import com.example.food_app.R
import kotlinx.android.synthetic.main.activity_show_food.view.*
import java.security.AccessControlContext

class MyAdapter(context: Context, val list: List<Food>):ArrayAdapter<Food>(context, R.layout.item_rv, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var itemView:View
        if(convertView == null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        }else{
            itemView = convertView
        }
        itemView.txt_name.text = list[position].name


        return itemView
    }


}