package com.bashir.marvel.ui.comics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.ExperimentalPagingApi
import com.bashir.marvel.R
import com.bashir.marvel.databinding.FragmentComicsBinding
import com.bashir.marvel.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

@ExperimentalPagingApi

class ComicsFragment : BaseFragment<FragmentComicsBinding>(R.layout.fragment_comics) {
    override val viewModel: ComicsViewModel by activityViewModels()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentComicsBinding =
        DataBindingUtil::inflate
    lateinit var comicsAdapter: ComicsAdapter

    override fun setupView() {
        binding.viewModel = viewModel
        comicsAdapter = ComicsAdapter()
        initPagingAdapter()
        binding.comicsRecyclerView.adapter = comicsAdapter
    }
    private fun initPagingAdapter(){
        lifecycleScope.launch {
            viewModel.getComicsWithPaging().collectLatest {
                comicsAdapter.submitData(it)
            }
        }
    }
}