package com.bashir.marvel.data.remote.response.comics


import com.google.gson.annotations.SerializedName

data class ItemXX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("type")
    val type: String?
)