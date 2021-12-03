package com.bashir.marvel.data.remote.response.character


import com.google.gson.annotations.SerializedName

data class CharacterData(
    @SerializedName("comicsDtos")
    val characterDtos: List<CharacterDto>?
)