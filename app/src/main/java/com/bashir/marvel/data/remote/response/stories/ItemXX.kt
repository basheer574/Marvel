package com.bashir.marvel.data.remote.response.stories


import com.google.gson.annotations.SerializedName

data class ItemXX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?
)