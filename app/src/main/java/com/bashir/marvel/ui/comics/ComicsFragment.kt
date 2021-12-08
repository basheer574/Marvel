package com.bashir.marvel.ui.comics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.bashir.marvel.R
import com.bashir.marvel.databinding.FragmentComicsBinding
import com.bashir.marvel.ui.base.BaseFragment

class ComicsFragment : BaseFragment<FragmentComicsBinding>(R.layout.fragment_comics) {
    override val viewModel: ComicsViewModel by activityViewModels()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentComicsBinding =
        DataBindingUtil::inflate

    override fun setupView() {
        binding.let {
            it.viewModel = viewModel
            it.comicsRecyclerView.adapter = ComicsAdapter(mutableListOf(),viewModel)
        }
    }
}