package com.bashir.marvel.model.network


import com.bashir.marvel.BuildConfig
import com.bashir.marvel.util.Constants
import com.bashir.marvel.util.Constants.md5
import okhttp3.Interceptor
import okhttp3.OkHttpClient

object Client {

    private const val apiKey = BuildConfig.PUPLIC_API_KEY
    private val ts = System.currentTimeMillis().toString()
    private const val privateKey = BuildConfig.PRIVATE_API_KEY
    private val hash = "$ts$privateKey$apiKey".md5()

    val apiClient = OkHttpClient.Builder()
        .addInterceptor(Interceptor { chain ->
            val origin = chain.request()
            val originHttpUrl = origin.url
                .newBuilder()
                .addQueryParameter("ts", ts)
                .addQueryParameter("apikey", apiKey)
                .addQueryParameter("hash", hash)
                .build()
            val request = origin.newBuilder().url(originHttpUrl).build()
            chain.proceed(request)
        })
}