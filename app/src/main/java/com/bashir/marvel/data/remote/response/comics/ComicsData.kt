package com.bashir.marvel.data.remote.response.comics


import com.google.gson.annotations.SerializedName

data class ComicsData(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("limit")
    val limit: Int?,
    @SerializedName("offset")
    val offset: Int?,
    @SerializedName("comicsDtos")
    val comicsDtos: List<ComicsDto>?,
    @SerializedName("total")
    val total: Int?
)