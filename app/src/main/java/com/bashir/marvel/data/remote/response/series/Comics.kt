package com.bashir.marvel.data.remote.response.series


import com.google.gson.annotations.SerializedName

data class Comics(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<ItemX>?,
    @SerializedName("returned")
    val returned: Int?
)