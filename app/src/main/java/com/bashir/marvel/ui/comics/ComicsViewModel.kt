package com.bashir.marvel.ui.comics

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.bashir.marvel.data.repository.MarvelRepository
import com.bashir.marvel.model.Character
import com.bashir.marvel.model.Comics
import com.bashir.marvel.util.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import java.lang.reflect.Constructor
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(repository: MarvelRepository) : ViewModel(),
    ComicsListener {
    val comics: LiveData<State<List<Comics>?>> = repository.getComics().asLiveData(Dispatchers.IO)

    override fun onComicClickListener(id: Int?) {

    }
}