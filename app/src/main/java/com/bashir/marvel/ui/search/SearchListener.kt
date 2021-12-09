package com.bashir.marvel.ui.search

import com.bashir.marvel.ui.base.BaseAdapter

interface SearchListener : BaseAdapter.BaseInteractionListener {
   fun onSearchItemClick(id: Int?)
}