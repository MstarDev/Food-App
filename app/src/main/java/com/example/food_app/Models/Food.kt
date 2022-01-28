package com.example.food_app.Models

class Food {
    var name:String? = null
    var products:String? = null
    var preparationOrder:String? = null

    constructor(name: String?, products: String?, preparationOrder: String?) {
        this.name = name
        this.products = products
        this.preparationOrder = preparationOrder
    }
}