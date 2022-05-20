package com.flora.shoppingapp.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): ArrayList<ShopItem>{
        return shopListRepository.getShopList()
    }
}