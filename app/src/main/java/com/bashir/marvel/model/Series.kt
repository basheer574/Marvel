package com.bashir.marvel.model

import com.bashir.marvel.data.remote.response.series.Thumbnail

data class Series(
    val id: Int?,
    val description: String?,
    val rating: String?,
    val title: String?,
    val thumbnail: Thumbnail?,
    val imageUrl: String?
)
