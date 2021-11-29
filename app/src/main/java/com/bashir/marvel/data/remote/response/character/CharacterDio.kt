package com.bashir.marvel.data.remote.response.character

import com.bashir.marvel.data.remote.response.thumnnail.Thumbnail

data class CharacterDio(
    val id: Int? = null,
    val description: String? = null,
    val series: String? = null,
    val stories: String? = null,
    val comics: String? = null,
    val thumbnail: List<Thumbnail>? = null,
)
