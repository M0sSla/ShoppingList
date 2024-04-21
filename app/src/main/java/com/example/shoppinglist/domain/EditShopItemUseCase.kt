package com.example.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(id: Int) {
        shopListRepository.editShopItem(id)
        TODO()
    }
}