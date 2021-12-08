package com.bashir.marvel.ui.search

import com.bashir.marvel.ui.base.PagingBaseAdapter

interface SearchListener : PagingBaseAdapter.BaseInteractionListener {
   fun onSearchItemClick(id: Int?)
}