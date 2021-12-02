package com.bashir.marvel.data.repository

import com.bashir.marvel.data.local.MarvelDataBase
import com.bashir.marvel.data.local.entity.CharacterEntity
import com.bashir.marvel.data.mapper.character.CharacterMapper
import com.bashir.marvel.data.network.Api
import com.bashir.marvel.model.Character
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class MarvelRepositoryImpl : MarvelRepository {

    val characterDao = MarvelDataBase.getInstance().marvelCharacterDao()
    private val marvelApiService = Api.marvelApi
    private val characterMapper = CharacterMapper()

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

    override fun getCharacters(): Flow<State<List<Character>?>> {
        return flow {
            emit(State.Loading)
            try {
                val characters = marvelApiService.getCharacters().body()?.data?.characterDtos
                    ?.map { characterDto ->
                        characterMapper.toModel(characterDto)
                    }
                emit(State.Success(characters))
            }catch (error: Throwable){
                emit(State.Error("${error.message}"))
            }
        }
    }
}