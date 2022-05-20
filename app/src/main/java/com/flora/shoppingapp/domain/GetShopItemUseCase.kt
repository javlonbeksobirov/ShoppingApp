package com.flora.shoppingapp.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopListItem(shopItemId)
    }

}