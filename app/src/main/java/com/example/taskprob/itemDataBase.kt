package com.example.taskprob

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [item::class], version = 1)
abstract class itemDataBase : RoomDatabase() {

    abstract fun itemDao(): itemDAO

    companion object {
        @Volatile
        private var INSTANCE: itemDataBase? = null
        fun getDataBase(context: Context): itemDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance =
                    Room.databaseBuilder(context.applicationContext, itemDataBase::class.java,
                        "item_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
