package com.bashir.marvel.data.network


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object Client {
    val apiClient = OkHttpClient.Builder()
        .addInterceptor(
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        )
        .addInterceptor(MarvelInterceptor())
        .build()
}