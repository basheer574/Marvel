package com.bashir.marvel.data.network

import com.bashir.marvel.data.remote.base.BaseMarvel
import com.bashir.marvel.data.remote.response.character.CharacterDto
import com.bashir.marvel.data.remote.response.comics.ComicsDto
import com.bashir.marvel.data.remote.response.series.SeriesDto
import com.bashir.marvel.data.remote.response.stories.StoriesDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface MarvelApiService {
    @GET("characters")
    suspend fun getCharacters(): Response<BaseMarvel<CharacterDto>>

    @GET("comics")
    suspend fun getComics(): Response<BaseMarvel<ComicsDto>>

    @GET("series")
    suspend fun getSeries(): Response<BaseMarvel<SeriesDto>>

    @GET("characters")
    suspend fun getCharacterSearch(
        @Query("nameStartsWith") name: String?
    ): Response<BaseMarvel<CharacterDto>>

    @GET("comics")
    suspend fun getComicsWithPaging(
        @Query("limit") limit: Int
    ): Response<BaseMarvel<ComicsDto>>
}