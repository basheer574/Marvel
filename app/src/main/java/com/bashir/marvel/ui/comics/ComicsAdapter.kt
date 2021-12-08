package com.bashir.marvel.ui.comics

import com.bashir.marvel.R
import com.bashir.marvel.model.Comics
import com.bashir.marvel.ui.base.BaseAdapter
import com.bashir.marvel.ui.base.PagingBaseAdapter


class ComicsAdapter(items: List<Comics>, listener: ComicsListener) :
    PagingBaseAdapter<Comics>(items, listener) {
    override val layoutId: Int = R.layout.item_comics
}