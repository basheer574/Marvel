package com.bashir.marvel.data.remote.response.character.stories


import com.google.gson.annotations.SerializedName

data class Stories(
    @SerializedName("available")
    val available: Int?,
    @SerializedName("collectionURI")
    val collectionURI: String?,
    @SerializedName("items")
    val items: List<StoriesItems>?,
    @SerializedName("returned")
    val returned: Int?
)