package com.bashir.marvel.data.remote.response.character.comics


import com.google.gson.annotations.SerializedName

data class ComicsItems(
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?
)