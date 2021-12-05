package com.bashir.marvel.data.mapper.comics

import com.bashir.marvel.data.mapper.base.BaseMapper
import com.bashir.marvel.data.remote.response.comics.ComicsDto
import com.bashir.marvel.model.Comics

class ComicsMapper : BaseMapper<ComicsDto,Comics>{
    override fun map(type: ComicsDto): Comics {
        return Comics(
            id = type.id,
            title = type.title,
            thumbnail = type.thumbnail,
            issueNumber = type.issueNumber,
            imageUrl = "${type.thumbnail?.path}.${type.thumbnail?.extension}",
            prices = type.prices
        )
    }
}