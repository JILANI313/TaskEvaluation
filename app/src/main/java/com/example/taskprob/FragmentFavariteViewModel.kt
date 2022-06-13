package com.example.taskprob

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

@Suppress("SpellCheckingInspection")
 class FragmentFavariteViewModel(getApplication: Application) : ViewModel() {

    private val repository: ItemRepository

    init {
        val itemDAO = itemDataBase.getDataBase(getApplication).itemDao()
        repository = ItemRepository(itemDAO)
    }

    fun insertItem(item: item) {
        viewModelScope.launch {
            repository.insertItem(item)
        }
    }

    fun getItem(item: item) {
        viewModelScope.launch {
            repository.getItems(item)
        }
    }
}