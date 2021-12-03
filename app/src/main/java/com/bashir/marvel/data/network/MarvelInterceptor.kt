package com.bashir.marvel.data.network

import com.bashir.marvel.BuildConfig
import com.bashir.marvel.util.Constants.md5
import okhttp3.Interceptor
import okhttp3.Response

class MarvelInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val timestamp = System.currentTimeMillis().toString()
        val apiKey = BuildConfig.PUPLIC_API_KEY
        val hash = "$timestamp${BuildConfig.PRIVATE_API_KEY}$apiKey".md5()

        with(chain.request()) {

            url.newBuilder().apply {

                addQueryParameter("ts", timestamp)
                addQueryParameter("apikey", apiKey)
                addQueryParameter("hash", hash)

            }.build().also {
                return chain.proceed(this.newBuilder().url(it).build())
            }
        }
    }
}