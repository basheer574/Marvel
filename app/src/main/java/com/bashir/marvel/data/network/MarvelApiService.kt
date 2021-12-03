package com.bashir.marvel.data.network

import com.bashir.marvel.data.remote.response.BaseMarvel
import com.bashir.marvel.data.remote.response.character.CharacterData
import com.bashir.marvel.data.remote.response.comics.ComicsData
import com.bashir.marvel.data.remote.response.series.SeriesData
import com.bashir.marvel.data.remote.response.stories.StoriesData
import dagger.Provides
import retrofit2.Response
import retrofit2.http.GET


interface MarvelApiService {
    @GET("v1/public/characters")
    suspend fun getCharacters() : Response<BaseMarvel<CharacterData>>

    @GET("v1/public/comics")
    suspend fun getComics() : Response<BaseMarvel<ComicsData>>

    @GET("v1/public/series")
    suspend fun getSeries() : Response<BaseMarvel<SeriesData>>

    @GET("v1/public/stories")
    suspend fun getStories() : Response<BaseMarvel<StoriesData>>
}