package com.bashir.marvel.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class SearchViewModel @Inject constructor(repository: MarvelRepository) : ViewModel(),
    SearchListener {

    override fun onSearchItemClick(id: Int?) {

    }
}