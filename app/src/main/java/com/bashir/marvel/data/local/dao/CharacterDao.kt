package com.bashir.marvel.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bashir.marvel.data.local.entity.CharacterEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun addCharacters(items: List<CharacterEntity>)
//
//    @Query("SELECT * FROM CHARACTERS")
//    suspend fun getCharacters(): Flow<List<CharacterEntity>>
//
//    @Query("SELECT * FROM CHARACTERS")
//    suspend fun getCharacterToMap(): List<CharacterEntity>
}