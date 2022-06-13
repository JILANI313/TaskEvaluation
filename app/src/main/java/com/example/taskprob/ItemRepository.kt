package com.example.taskprob

class ItemRepository(private val itemDAO: itemDAO) {
    suspend fun insertItem(item: item) {
        itemDAO.insertItem(item.apply {

            (item(1, "k", false))
            (item(2, "j", false))
            (item(3, "j", false))
            (item(4, "j", false))
            (item(5, "j", false))
            (item(7, "j", false))
            (item(8, "j", false))
            (item(10, "j", false))
            (item(11, "j", false))
            (item(12, "j", false))

        })

    }

    suspend fun getItems(item: item) {
        itemDAO.getItem(item.apply {

        })

    }

}