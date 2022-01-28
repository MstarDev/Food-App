package com.example.food_app.Cache

import android.content.Context
import android.content.SharedPreferences
import com.example.food_app.Models.Food
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreferance {

    private const val NAME = "KeshXotira"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences


    fun init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)

    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor)-> Unit){

        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var ObjectString : ArrayList<Food>
    get()=gsonStringToArray(preferences.getString("object","[]")!!)
    set(value) = preferences.edit {
        it.putString("object", arrayToGsonString(value))
    }

     fun arrayToGsonString(arrayList:ArrayList<Food>): String? {
        return Gson().toJson(arrayList)
    }

     fun gsonStringToArray(gsonString: String):ArrayList<Food> {
         val typeToken  = object : TypeToken<ArrayList<Food>>(){}.type
         return Gson().fromJson(gsonString, typeToken)

    }
}