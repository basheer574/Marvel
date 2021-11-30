package com.bashir.marvel.ui.home

import com.bashir.marvel.R
import com.bashir.marvel.data.remote.response.character.CharacterDio
import com.bashir.marvel.ui.base.BaseAdapter

class CharacterAdapter(items: List<CharacterDio>, listener: CharacterListener)
    : BaseAdapter<CharacterDio>(items, listener) {
    override val layoutId: Int = R.layout.item_character_show_more
}