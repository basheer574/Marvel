package com.bashir.marvel.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.ui.character.CharacterViewModel

class MarvelViewModelFactory(private val repository: MarvelRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass==CharacterViewModel::class.java)
            return CharacterViewModel(repository) as T
        throw Throwable("View model not found!")
    }
}