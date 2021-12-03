package com.bashir.marvel.di

import com.bashir.marvel.data.mapper.character.CharacterMapper
import com.bashir.marvel.data.network.Api
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
        characterMapper: CharacterMapper
    ): MarvelRepository {
        return MarvelRepositoryImpl(marvelApiService, characterMapper)
    }

    @Provides
    fun provideCharacterMapper(): CharacterMapper = CharacterMapper()

}