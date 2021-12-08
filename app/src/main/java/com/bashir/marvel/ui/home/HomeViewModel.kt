package com.bashir.marvel.ui.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bashir.marvel.data.repository.MarvelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(repository: MarvelRepository) : ViewModel(), HomeListener {

    val characters = repository.getCharacters().asLiveData()
    //val comics = repository.getComics().asLiveData()
    val series = repository.getSeries().asLiveData()

    override fun onHomeItemClickListener(id: Int?) {

    }
}