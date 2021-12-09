package com.bashir.marvel.ui.search

import androidx.lifecycle.*
import com.bashir.marvel.data.remote.base.BaseMarvel
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(val repository: MarvelRepository) : ViewModel(),
    SearchListener {
    val searchResult =  MutableLiveData<State<List<Character>?>>()

    @FlowPreview
    fun onSearchTextChanged(text: CharSequence?) {
        viewModelScope.launch {
            repository.getCharacterBySearch(text.toString()).debounce(1000L)
                .collect {
                    searchResult.postValue(it)
                }
        }
    }

    override fun onSearchItemClick(id: Int?) {

    }
}