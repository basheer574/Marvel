package com.bashir.marvel.model.repository

import com.bashir.marvel.data.local.MarvelDataBase
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.model.network.Api
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class MarvelRepositoryImpl : MarvelRepository {

    val characterDao = MarvelDataBase.getInstance().marvelCharacterDao()
    private val marvelApiService = Api.marvelApi

    private fun <T> wrapWithFlow(endPointResponse: suspend () -> Response<T>): Flow<State<T?>> {
        return flow {
            emit(State.Loading)
            try {
                val result = endPointResponse()
                if (result.isSuccessful) {
                    emit(State.Success(result.body()))
                } else {
                    emit(State.Error("Error"))
                }
            } catch (e: Exception) {
                State.Error("Error")
            }
        }
    }

    override fun getCharacters(): Flow<List<CharacterEntity>> {
        return characterDao.getCharacters()
    }

    override suspend fun refreshCharacters() {
        val response = marvelApiService.getCharacters()
        val items = response.body()?.data?.characterDtos?.map {
            CharacterEntity(
                id = it.id?.toLong() ?: 0L,
                name = it.name ?: "",
                description = it.description ?: "no description",
                modified = it.modified ?: "",
                imageUrl = "${it.thumbnail?.path}.${it.thumbnail?.extension}"
            )
        }
        items?.let { characterDao.addCharacters(it) }
    }
}