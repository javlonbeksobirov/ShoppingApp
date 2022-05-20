package com.flora.shoppingapp.domain

interface ShopListRepository {

    fun addShopListItem(shopItem: ShopItem)

    fun deleteShopListItem(shopItem: ShopItem)

    fun editShopListItem(shoItem: ShopItem)

    fun getShopListItem(shopItemId: Int): ShopItem

    fun getShopList(): ArrayList<ShopItem>


}