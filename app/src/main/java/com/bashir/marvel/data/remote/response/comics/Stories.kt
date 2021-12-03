package com.bashir.marvel.data.remote.response.comics


import com.google.gson.annotations.SerializedName

data class Stories(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<ItemXX>?,
    @SerializedName("returned")
    val returned: Int?
)