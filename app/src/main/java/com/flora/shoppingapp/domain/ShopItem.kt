package com.flora.shoppingapp.domain

data class ShopItem(
    val name: String,
    val price: String,
    val image: Int,
    val count: Int,
    var id: Int = UNDEFINED_ID,
)
{
    companion object{
        const val UNDEFINED_ID = -1
    }
}
