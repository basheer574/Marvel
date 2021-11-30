package com.bashir.marvel.model.repository

import com.bashir.marvel.data.remote.response.BaseMarvel
import com.bashir.marvel.data.remote.response.character.CharacterData
import com.bashir.marvel.model.network.Api
import com.bashir.marvel.util.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

object MarvelRepository {
    private fun <T> wrapWithFlow(endPointResponse: suspend () -> Response<T>): Flow<State<T?>> {
        return flow {
            emit(State.Loading)
            try {
                val result = endPointResponse()
                if (result.isSuccessful) {
                    emit(State.Success(result.body()))
                } else {
                    emit(State.Error(result.message()))
                }
            } catch (e: Exception) {
                State.Error(e.message.toString())
            }
        }
    }

    fun getCharacters() : Flow<State<BaseMarvel<CharacterData>?>> = wrapWithFlow { Api.marvelApi.getCharacters() }
}