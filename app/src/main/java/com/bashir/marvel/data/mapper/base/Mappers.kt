package com.bashir.marvel.data.mapper.base

import coil.map.Mapper
import com.bashir.marvel.data.mapper.character.CharacterMapper
import com.bashir.marvel.data.mapper.comics.ComicsMapper

class Mappers {
    fun getCharacterMapper(): CharacterMapper = CharacterMapper()
    fun getComicsMapper(): ComicsMapper = ComicsMapper()
    fun getStoriesMapper(){}
    fun getSeriesMapper(){}
    fun getSearchMapper(){}
}