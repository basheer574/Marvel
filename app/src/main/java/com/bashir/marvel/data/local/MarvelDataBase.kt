package com.bashir.marvel.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bashir.marvel.data.local.dao.CharacterDao
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.util.Constants

@Database(entities = [CharacterEntity::class], version = Constants.DATABASE_VERSION)
abstract class MarvelDataBase  : RoomDatabase(){
    abstract fun marvelCharacterDao(): CharacterDao

    companion object{
        private const val databaseName = "MarvelDatabase"
        private var instance: MarvelDataBase? = null

        fun init(context: Context): MarvelDataBase{
            return instance?: synchronized(this)
            {buildDatabase(context).also{database-> instance = database}}
        }

        fun getInstance() = instance!!

        private fun buildDatabase(context: Context) : MarvelDataBase{
            return Room.databaseBuilder(context,MarvelDataBase::class.java, databaseName)
                .build()
        }
    }
}