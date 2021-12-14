package com.bashir.marvel.ui.comics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bashir.marvel.R
import com.bashir.marvel.data.remote.response.comics.ComicsDto
import com.bashir.marvel.databinding.ItemComicsBinding


@ExperimentalPagingApi
class ComicsAdapter : PagingDataAdapter<ComicsDto, ComicsAdapter.ItemViewHolder>(diffCallback) {

    override fun onBindViewHolder(holder: ComicsAdapter.ItemViewHolder, position: Int) {
        val currentComic = getItem(position)
        holder.binding.item = currentComic
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComicsAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comics, parent, false)
        return ItemViewHolder(view)
    }

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<ComicsDto>() {
            override fun areItemsTheSame(oldItem: ComicsDto, newItem: ComicsDto): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ComicsDto,
                newItem: ComicsDto
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemComicsBinding.bind(view)
    }
}