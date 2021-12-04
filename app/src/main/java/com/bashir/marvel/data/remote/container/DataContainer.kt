package com.bashir.marvel.data.remote.container

import com.google.gson.annotations.SerializedName

data class DataContainer<T>(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("limit")
    val limit: Int? = null,
    @SerializedName("offset")
    val offset: Int? = null,
    @SerializedName("results")
    val results: List<T>? = null,
    @SerializedName("total")
    val total: Int? = null
)