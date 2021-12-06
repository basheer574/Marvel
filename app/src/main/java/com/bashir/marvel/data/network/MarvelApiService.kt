package com.bashir.marvel.data.network

import com.bashir.marvel.data.remote.base.BaseMarvel
import com.bashir.marvel.data.remote.response.character.CharacterDto
import com.bashir.marvel.data.remote.response.comics.ComicsDto
import com.bashir.marvel.data.remote.response.series.SeriesDto
import com.bashir.marvel.data.remote.response.stories.StoriesDto
import retrofit2.Response
import retrofit2.http.GET


interface MarvelApiService {
    @GET("characters")
    suspend fun getCharacters() : Response<BaseMarvel<CharacterDto>>

    @GET("comics")
    suspend fun getComics() : Response<BaseMarvel<ComicsDto>>

    @GET("series")
    suspend fun getSeries() : Response<BaseMarvel<SeriesDto>>

    @GET("v1/public/stories")
    suspend fun getStories() : Response<BaseMarvel<StoriesDto>>
}