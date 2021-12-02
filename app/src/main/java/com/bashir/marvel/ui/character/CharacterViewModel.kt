package com.bashir.marvel.ui.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.data.repository.MarvelRepositoryImpl
import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import kotlinx.coroutines.Dispatchers

class CharacterViewModel(repository: MarvelRepository) : ViewModel() , CharacterListener {


    val character: LiveData<State<List<Character>?>> = repository.getCharacters()
        .asLiveData(Dispatchers.IO)
    override fun onCharacterSelected(id: Int) {

    }
}