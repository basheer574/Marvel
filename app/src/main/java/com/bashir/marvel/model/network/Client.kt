package com.bashir.marvel.model.network

import com.bashir.marvel.util.Constants
import okhttp3.Interceptor
import okhttp3.OkHttpClient

object Client {
    val apiClient = OkHttpClient.Builder()
        .addInterceptor(Interceptor { chain ->
            val origin = chain.request()
            val originHttpUrl = origin.url
                .newBuilder()
                .addQueryParameter("ts", Constants.TS)
                .addQueryParameter("apikey",Constants.PUBLIC_API_KEY)
                .addQueryParameter("hash",Constants.HASH_SIGNATURE)
                .build()
            val request = origin.newBuilder().url(originHttpUrl).build()
            chain.proceed(request)
        })
}