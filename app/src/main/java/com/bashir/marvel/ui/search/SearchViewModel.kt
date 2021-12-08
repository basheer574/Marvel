package com.bashir.marvel.ui.search

import androidx.lifecycle.ViewModel
import com.bashir.marvel.data.repository.MarvelRepository
import javax.inject.Inject

class SearchViewModel @Inject constructor(repository: MarvelRepository) : ViewModel(),
    SearchListener {
    override fun onSearchItemClick(id: Int?) {
        TODO("Not yet implemented")
    }
}