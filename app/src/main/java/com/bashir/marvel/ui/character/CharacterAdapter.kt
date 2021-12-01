package com.bashir.marvel.ui.character

import com.bashir.marvel.R
import com.bashir.marvel.model.Character
import com.bashir.marvel.ui.base.BaseAdapter

class CharacterAdapter(items: List<Character>, listener: CharacterListener)
    : BaseAdapter<Character>(items, listener) {
    override val layoutId: Int = R.layout.item_character_show_more
}
