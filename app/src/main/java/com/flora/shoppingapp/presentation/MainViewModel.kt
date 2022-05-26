package com.flora.shoppingapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.flora.shoppingapp.data.ShopListRepositoryImpl
import com.flora.shoppingapp.domain.DeleteShopListItemUseCase
import com.flora.shoppingapp.domain.EditShopListItemUseCase
import com.flora.shoppingapp.domain.GetShopListUseCase
import com.flora.shoppingapp.domain.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopListItemUseCase(repository)
    private val editShopItemUseCase = EditShopListItemUseCase(repository)

    var shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList(){
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }
}