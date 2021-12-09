package com.bashir.marvel.ui.search

import com.bashir.marvel.R
import com.bashir.marvel.model.Character
import com.bashir.marvel.ui.base.BaseAdapter

class SearchAdapter(items: List<Character>, listener: SearchListener) :
    BaseAdapter<Character>(items, listener) {
    override val layoutId: Int = R.layout.item_search
}