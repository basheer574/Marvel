package com.bashir.marvel.data.remote.response.character


import com.google.gson.annotations.SerializedName

data class CharacterData(
    @SerializedName("results")
    val characterDtos: List<CharacterDto>?
)