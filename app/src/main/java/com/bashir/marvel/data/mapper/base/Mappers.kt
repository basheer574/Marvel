package com.bashir.marvel.data.mapper.base

import coil.map.Mapper
import com.bashir.marvel.data.mapper.character.CharacterMapper
import com.bashir.marvel.data.mapper.comics.ComicsMapper
import com.bashir.marvel.data.mapper.series.SeriesMapper

class Mappers {
    fun getCharacterMapper(): CharacterMapper = CharacterMapper()
    fun getComicsMapper(): ComicsMapper = ComicsMapper()
    fun getSeriesMapper(): SeriesMapper = SeriesMapper()
    fun getSearchMapper(){}
}