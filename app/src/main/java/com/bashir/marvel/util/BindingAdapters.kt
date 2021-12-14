package com.bashir.marvel.util

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import coil.transform.Transformation
import com.bashir.marvel.R
import com.bashir.marvel.ui.base.BaseAdapter
import com.bashir.marvel.ui.base.PagingBaseAdapter

@BindingAdapter(value = ["app:showOnLoading"])
fun <T> showOnLoading(view: View, state: State<T>?) {
    if (state is State.Loading)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}

@BindingAdapter(value = ["app:showOnError"])
fun <T> showOnError(view: View, state: State<T>?) {
    if (state is State.Error)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}

@BindingAdapter(value = ["app:showOnSuccess"])
fun <T> showOnSuccess(view: View, state: State<T>?) {
    if (state is State.Success)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    if (items != null) {
        (view.adapter as BaseAdapter<T>?)?.setItems(items)
    } else {
        (view.adapter as BaseAdapter<T>?)?.setItems(emptyList())
    }
}
@BindingAdapter(value = ["imageUrl"])
fun setImageFromUrl(view: ImageView,url: String?){
    view.load(url){
        crossfade(true)
        placeholder(R.drawable.ic_image_place_holder)
        transformations(CircleCropTransformation())
    }
}
@BindingAdapter(value = ["imagePath","imageExtension"])
fun setImageFromUrlWithExtension(view: ImageView,imagePath: String?,imageExtension: String?) {
    view.load("${imagePath}.${imageExtension}") {
        crossfade(true)
        placeholder(R.drawable.ic_image_place_holder)
        transformations(CircleCropTransformation())
    }
}