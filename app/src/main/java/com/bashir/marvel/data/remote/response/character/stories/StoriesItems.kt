package com.bashir.marvel.data.remote.response.character.stories


import com.google.gson.annotations.SerializedName

data class StoriesItems(
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("type")
    val type: String?
)