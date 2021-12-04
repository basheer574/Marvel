package com.bashir.marvel.util

sealed class State<out T>(val data: T?) {
    class Success<T>(data: T) : State<T>(data)
    data class Error(val message: Throwable) : State<Nothing>(null)
    object Loading : State<Nothing>(null)

    override fun toString(): String {
        return when(this){
            is Success ->"Success $data"
            is Error -> "Error ${message.message}"
            Loading ->"Loading"
        }
    }
}
