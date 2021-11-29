package com.bashir.marvel.data.remote.response


import com.bashir.marvel.data.remote.response.character.Data
import com.google.gson.annotations.SerializedName

data class BaseMarvel(
    @SerializedName("attributionHTML")
    val attributionHTML: String?,
    @SerializedName("attributionText")
    val attributionText: String?,
    @SerializedName("code")
    val code: Int?,
    @SerializedName("copyright")
    val copyright: String?,
    @SerializedName("data")
    val data: Data?,
    @SerializedName("etag")
    val etag: String?,
    @SerializedName("status")
    val status: String?
)