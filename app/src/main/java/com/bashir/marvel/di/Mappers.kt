package com.bashir.marvel.di

import com.bashir.marvel.data.mapper.character.CharacterMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Mappers {
    @Provides
    fun provideCharacterMapper(): CharacterMapper = CharacterMapper()
}