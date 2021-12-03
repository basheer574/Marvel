package com.bashir.marvel.data.remote.response.stories


import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<Any>?,
    @SerializedName("returned")
    val returned: Int?
)