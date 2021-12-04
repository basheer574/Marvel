package com.bashir.marvel.ui.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject


@HiltViewModel
class CharacterViewModel @Inject constructor(repository: MarvelRepository)
    : ViewModel() , CharacterListener {
    val character: LiveData<State<List<Character>?>> = repository.getCharacters()
        .asLiveData(Dispatchers.IO)

    override fun onCharacterSelected(id: Int) {

    }
}