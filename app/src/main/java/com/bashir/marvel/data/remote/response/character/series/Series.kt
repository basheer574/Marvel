package com.bashir.marvel.data.remote.response.character.series


import com.google.gson.annotations.SerializedName

data class Series(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<SeriesItems>?,
    @SerializedName("returned")
    val returned: Int?
)