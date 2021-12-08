package com.bashir.marvel.ui.home

import com.bashir.marvel.ui.base.BaseAdapter

interface HomeListener : BaseAdapter.BaseInteractionListener {
    fun onHomeItemClickListener(id: Int?)
}