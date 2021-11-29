package com.bashir.marvel.data.network

import com.bashir.marvel.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {

    val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .client(Client.apiClient.build())
        .addConverterFactory(GsonConverterFactory.create())

        .build()

    val marvelApi = retrofit.create(MarvelApiService::class.java)
}