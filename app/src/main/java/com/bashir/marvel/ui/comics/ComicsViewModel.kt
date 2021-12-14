package com.bashir.marvel.ui.comics


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.bashir.marvel.data.remote.response.comics.ComicsDto
import com.bashir.marvel.data.repository.MarvelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(val repository: MarvelRepository) : ViewModel(),
    ComicsListener {
    //val comics: LiveData<State<List<Comics>?>> = repository.getComics().asLiveData(Dispatchers.IO)

    override fun onComicClickListener(id: Int?) {

    }

    fun getComicsWithPaging(): Flow<PagingData<ComicsDto>> {
        return repository.getComicsByPaging(pagingConfig = setupPageConfig())
            .cachedIn(viewModelScope)
    }
    private fun setupPageConfig(): PagingConfig{
        return PagingConfig(pageSize = 20)
    }
}