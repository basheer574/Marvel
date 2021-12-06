package com.bashir.marvel.data.mapper.series

import com.bashir.marvel.data.mapper.base.BaseMapper
import com.bashir.marvel.data.remote.response.series.SeriesDto
import com.bashir.marvel.model.Series

class SeriesMapper : BaseMapper<SeriesDto,Series> {
    override fun map(type: SeriesDto): Series {
        return Series(
            id =  type.id,
            title = type.title,
            thumbnail = type.thumbnail,
            imageUrl = "${type.thumbnail?.path}.${type.thumbnail?.extension}",
            description = type.description,
            rating = type.rating
        )
    }
}