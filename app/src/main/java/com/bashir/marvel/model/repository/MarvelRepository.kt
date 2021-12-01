package com.bashir.marvel.model.repository


import com.bashir.marvel.data.local.entity.CharacterEntity
import kotlinx.coroutines.flow.Flow

interface MarvelRepository {
    fun getCharacters() : Flow<List<CharacterEntity>>
    suspend fun refreshCharacters()
}