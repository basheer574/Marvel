package com.bashir.marvel.data.remote.response.character


import com.bashir.marvel.data.remote.response.character.comics.Comics
import com.bashir.marvel.data.remote.response.character.series.Series
import com.bashir.marvel.data.remote.response.character.stories.Stories
import com.bashir.marvel.data.remote.response.character.thumnnail.Thumbnail
import com.google.gson.annotations.SerializedName

data class CharacterDto(
    @SerializedName("comics")
    val comics: Comics?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("modified")
    val modified: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("resourceURI")
    val resourceURI: String?,
    @SerializedName("series")
    val series: Series?,
    @SerializedName("stories")
    val stories: Stories?,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail?,
    @SerializedName("urls")
    val urls: List<Url>?
)