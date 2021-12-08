package com.bashir.marvel.data.repository


import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.bashir.marvel.data.mapper.base.Mappers
import com.bashir.marvel.data.mapper.character.CharacterMapper
import com.bashir.marvel.data.network.MarvelApiService
import com.bashir.marvel.model.Character
import com.bashir.marvel.model.Comics
import com.bashir.marvel.model.Series
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class MarvelRepositoryImpl @Inject constructor(
    private val marvelApiService: MarvelApiService,
    private val mappers: Mappers
) : MarvelRepository{

    private fun <T> wrapWithFlow(endPointResponse: suspend () -> Response<T>): Flow<State<T?>> {
        return flow {
            emit(State.Loading)
            try {
                val result = endPointResponse()
                if (result.isSuccessful) {
                    emit(State.Success(result.body()))
                } else {
                    emit(State.Error(Throwable()))
                }
            } catch (e: Throwable) {
                State.Error(e)
            }
        }
    }

    override fun getCharacters(): Flow<State<List<Character>?>> {
        return flow {
            emit(State.Loading)
            try {
                val characters = marvelApiService.getCharacters().body()?.data?.results?.map {
                    mappers.getCharacterMapper().map(it)
                }
                emit(State.Success(characters))
            } catch (error: Throwable) {
                emit(State.Error(error))
            }
        }
    }

    override fun getComics(): Flow<State<List<Comics>?>> {
        return flow {
            emit(State.Loading)
            try {
                val comics = marvelApiService.getComics().body()?.data?.results?.map {
                    mappers.getComicsMapper().map(it)
                }
                emit(State.Success(comics))
            } catch (error: Throwable) {
                emit(State.Error(error))
            }
        }
    }

    override fun getSeries(): Flow<State<List<Series>?>> {
        return flow {
            emit(State.Loading)
            try {
                val series = marvelApiService.getSeries().body()?.data?.results?.map {
                    mappers.getSeriesMapper().map(it)
                }
                emit(State.Success(series))
            } catch (error: Throwable) {
                emit(State.Error(error))
            }
        }
    }

}