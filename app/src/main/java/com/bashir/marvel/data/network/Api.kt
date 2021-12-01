package com.bashir.marvel.data.network

import com.bashir.marvel.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {

    private val retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(Client.apiClient.build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val marvelApi: MarvelApiService = retrofit.create(MarvelApiService::class.java)
}