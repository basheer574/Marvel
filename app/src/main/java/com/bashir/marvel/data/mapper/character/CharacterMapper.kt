package com.bashir.marvel.data.mapper.character

import com.bashir.marvel.data.mapper.base.BaseMapper
import com.bashir.marvel.data.remote.response.character.CharacterDto
import com.bashir.marvel.model.Character
import dagger.Provides

class CharacterMapper : BaseMapper<CharacterDto,Character> {
    override fun map(type: CharacterDto): Character {
        return Character(
            id = type.id,
            name = type.name,
            imageUrl = "${type.thumbnail?.path}.${type.thumbnail?.extension}",
            comics = type.comics,
            description = type.description,
            series = type.series,
            stories = type.stories,
            modified = type.modified,
            resourceURI = type.resourceURI,
            thumbnail = type.thumbnail,
            urls = type.urls
        )
    }
}