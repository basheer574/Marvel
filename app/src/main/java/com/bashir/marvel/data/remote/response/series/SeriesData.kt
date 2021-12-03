package com.bashir.marvel.data.remote.response.series


import com.google.gson.annotations.SerializedName

data class SeriesData(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("limit")
    val limit: Int?,
    @SerializedName("offset")
    val offset: Int?,
    @SerializedName("seriesDtos")
    val seriesDtos: List<SeriesDto>?,
    @SerializedName("total")
    val total: Int?
)