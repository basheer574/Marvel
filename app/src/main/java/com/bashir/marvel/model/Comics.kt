package com.bashir.marvel.model

import com.bashir.marvel.data.remote.response.comics.Price
import com.bashir.marvel.data.remote.response.comics.Thumbnail

data class Comics (
    val id: Int?,
    val issueNumber: Int?,
    val prices: List<Price>?,
    val thumbnail: Thumbnail?,
    val title: String?,
    val imageUrl: String?,
)