package com.bashir.marvel.ui.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.data.repository.MarvelRepositoryImpl
import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() , CharacterListener {

    private val repository = MarvelRepositoryImpl()
    val character: LiveData<State<List<Character>?>> = repository.getCharacters().asLiveData()

    init {
        viewModelScope.launch {
            repository.refreshCharacters()
        }
    }
    override fun onCharacterSelected(id: Int) {

    }
}