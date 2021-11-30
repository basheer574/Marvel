package com.bashir.marvel.ui.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bashir.marvel.model.repository.MarvelRepository

class HomeViewModel : ViewModel() ,CharacterListener{
    private val repository = MarvelRepository
    val character = repository.getCharacters().asLiveData()

    override fun onCharacterSelected(id: Int) {

    }
}