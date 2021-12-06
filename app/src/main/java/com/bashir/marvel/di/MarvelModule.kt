package com.bashir.marvel.di

import coil.map.Mapper
import com.bashir.marvel.data.mapper.base.Mappers
import com.bashir.marvel.data.network.MarvelApiService
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.data.repository.MarvelRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MarvelModule {
    @Provides
    fun provideRepository(
        marvelApiService: MarvelApiService,
        mappers: Mappers
    ): MarvelRepository {
        return MarvelRepositoryImpl(marvelApiService, mappers)
    }
    @Provides
    fun provideMappers():Mappers = Mappers()
}