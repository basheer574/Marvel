package com.bashir.marvel.ui.comics

import com.bashir.marvel.ui.base.BaseAdapter
import com.bashir.marvel.ui.base.PagingBaseAdapter

interface ComicsListener : PagingBaseAdapter.BaseInteractionListener{
    fun onComicClickListener(id: Int?)
}