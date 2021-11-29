package com.bashir.marvel.ui.base

import androidx.recyclerview.widget.DiffUtil

class MarvelDiffutils<T>(
    private val marvelList: List<T>,
    private val marvelNewList: List<T>
) :
    DiffUtil.Callback() {
    override fun getOldListSize() = marvelList.size

    override fun getNewListSize() = marvelNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        marvelList[oldItemPosition] == marvelNewList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = true
}