package com.bashir.marvel.ui.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.model.repository.MarvelRepositoryImpl
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() , CharacterListener {

    private val repository = MarvelRepositoryImpl()
    val character: LiveData<List<CharacterEntity>> = repository.getCharacters().asLiveData()

    init {
        viewModelScope.launch {
            repository.refreshCharacters()
        }
    }
    override fun onCharacterSelected(id: Int) {

    }
}