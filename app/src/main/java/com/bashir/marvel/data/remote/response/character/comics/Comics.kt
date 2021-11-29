package com.bashir.marvel.data.remote.response.character.comics


import com.google.gson.annotations.SerializedName

data class Comics(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val comicsItems: List<ComicsItems>?,
    @SerializedName("returned")
    val returned: Int?
)