package com.example.taskprob

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface itemDAO {
    @Insert
    suspend fun insertItem(item: item)

    @Delete
    suspend fun deleteItem(item: item)


    @Query("SELECT * FROM `all`")
    suspend fun getItem(apply: item): LiveData<List<item>>
}