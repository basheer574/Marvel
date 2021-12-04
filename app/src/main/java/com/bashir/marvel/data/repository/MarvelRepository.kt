package com.bashir.marvel.data.repository


import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow

interface MarvelRepository {
    fun getCharacters() : Flow<State<List<Character>?>>
}