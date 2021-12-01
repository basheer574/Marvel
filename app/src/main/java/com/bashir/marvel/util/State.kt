package com.bashir.marvel.util

sealed class State<out T>(val data: T?) {

    class Success<T>(data: T) : State<T>(data)
    class Error(val message: String) : State<Nothing>(null)
    object Loading : State<Nothing>(null)

}
