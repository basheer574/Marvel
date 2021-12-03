package com.bashir.marvel.data.network

import com.bashir.marvel.data.remote.response.BaseMarvel
import com.bashir.marvel.data.remote.response.character.CharacterData
import retrofit2.Response
import retrofit2.http.GET

interface MarvelApiService {
    @GET("v1/public/characters")
    suspend fun getCharacters() : Response<BaseMarvel<CharacterData>>
}