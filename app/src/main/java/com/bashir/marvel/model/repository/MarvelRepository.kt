package com.bashir.marvel.model.repository

import com.bashir.marvel.data.local.MarvelDataBase
import com.bashir.marvel.data.local.dao.CharacterDao
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.data.remote.response.BaseMarvel
import com.bashir.marvel.data.remote.response.character.CharacterData
import com.bashir.marvel.model.network.Api
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

interface MarvelRepository {
    fun getCharacters() : Flow<List<CharacterEntity>>
    suspend fun refreshCharacters()
}