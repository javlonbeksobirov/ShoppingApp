package com.flora.shoppingapp.domain

class EditShopListItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopListItem(shopItem: ShopItem){
        shopListRepository.editShopListItem(shopItem)
    }
}