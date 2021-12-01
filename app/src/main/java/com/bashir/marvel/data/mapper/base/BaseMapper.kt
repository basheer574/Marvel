package com.bashir.marvel.data.mapper.base

interface BaseMapper<I,O> {
    fun toModel(type: I) : O
    fun toResponse(type: O) : I
}