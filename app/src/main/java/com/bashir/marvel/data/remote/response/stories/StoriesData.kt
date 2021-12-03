package com.bashir.marvel.data.remote.response.stories


import com.google.gson.annotations.SerializedName

data class StoriesData(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("limit")
    val limit: Int?,
    @SerializedName("offset")
    val offset: Int?,
    @SerializedName("storiesDtos")
    val storiesDtos: List<StoriesDto>?,
    @SerializedName("total")
    val total: Int?
)