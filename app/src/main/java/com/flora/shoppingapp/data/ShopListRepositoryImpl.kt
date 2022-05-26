package com.flora.shoppingapp.data

import com.flora.shoppingapp.domain.ShopItem
import com.flora.shoppingapp.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl : ShopListRepository{
    private val shopList = mutableListOf<ShopItem>()

    private var authoIncrementId = 0

    override fun addShopListItem(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFINED_ID){
            shopItem.id = authoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopListItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopListItem(shoItem: ShopItem) {
        val oldElement = getShopListItem(shoItem.id)
        shopList.remove(oldElement)
        addShopListItem(shoItem)
    }

    override fun getShopListItem(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}