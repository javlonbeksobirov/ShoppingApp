package com.flora.shoppingapp.domain

class DeleteShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopListItem(shopItem: ShopItem){
        shopListRepository.deleteShopListItem(shopItem)
    }
}