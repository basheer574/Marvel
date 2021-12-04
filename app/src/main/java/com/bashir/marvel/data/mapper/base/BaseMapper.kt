package com.bashir.marvel.data.mapper.base


interface BaseMapper<I,O> {
    fun map(type: I) : O
}