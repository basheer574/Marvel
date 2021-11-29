package com.bashir.marvel.data.remote.response.character.series


import com.google.gson.annotations.SerializedName

data class SeriesItems(
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?
)