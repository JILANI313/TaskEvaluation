package com.example.taskprob

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "all")
data class all_Item(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var name:String
)
