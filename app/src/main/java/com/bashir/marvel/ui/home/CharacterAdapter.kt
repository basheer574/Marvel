package com.bashir.marvel.ui.home

import com.bashir.marvel.R
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.data.remote.response.character.CharacterDto
import com.bashir.marvel.ui.base.BaseAdapter

class CharacterAdapter(items: List<CharacterEntity>, listener: CharacterListener)
    : BaseAdapter<CharacterEntity>(items, listener) {
    override val layoutId: Int = R.layout.item_character_show_more
}
