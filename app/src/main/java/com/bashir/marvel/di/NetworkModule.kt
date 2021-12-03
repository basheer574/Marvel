package com.bashir.marvel.di

import com.bashir.marvel.BuildConfig
import com.bashir.marvel.data.network.Client
import com.bashir.marvel.data.network.MarvelApiService
import com.bashir.marvel.data.network.MarvelInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideMarvelApi(
        okHttpClient: OkHttpClient
        ,gsonConverterFactory: GsonConverterFactory
    ): MarvelApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()

        return retrofit.create(MarvelApiService::class.java)
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(
        marvelInterceptor: MarvelInterceptor
        ,loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient
            .Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(marvelInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideAuthInterceptor() = MarvelInterceptor()

    @Singleton
    @Provides
    fun provideLoggingInterceptor() = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Singleton
    @Provides
    fun provideGson(): GsonConverterFactory = GsonConverterFactory.create()
}