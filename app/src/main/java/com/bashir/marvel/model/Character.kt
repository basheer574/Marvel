package com.bashir.marvel.model

import com.bashir.marvel.data.remote.response.character.Url
import com.bashir.marvel.data.remote.response.character.comics.Comics
import com.bashir.marvel.data.remote.response.character.series.Series
import com.bashir.marvel.data.remote.response.character.stories.Stories
import com.bashir.marvel.data.remote.response.character.thumnnail.Thumbnail

data class Character(
    val id: Int?,
    val name: String?,
    val description: String?,
    val imageUrl: String?,
    val comics: Comics?,
    val modified: String?,
    val resourceURI: String?,
    val series: Series?,
    val stories: Stories?,
    val thumbnail: Thumbnail?,
    val urls: List<Url>?
)
