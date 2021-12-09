package com.bashir.marvel.data.repository


import com.bashir.marvel.model.Character
import com.bashir.marvel.model.Comics
import com.bashir.marvel.model.Series
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow

interface MarvelRepository {
    fun getCharacters() : Flow<State<List<Character>?>>
    fun getComics(): Flow<State<List<Comics>?>>
    fun getSeries(): Flow<State<List<Series>?>>
    fun getCharacterBySearch(name: String): Flow<State<List<Character>?>>
}