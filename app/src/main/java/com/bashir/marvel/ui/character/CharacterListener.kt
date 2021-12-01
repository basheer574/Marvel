package com.bashir.marvel.ui.character

import com.bashir.marvel.ui.base.BaseAdapter

interface CharacterListener : BaseAdapter.BaseInteractionListener{
    fun onCharacterSelected(id: Int)
}