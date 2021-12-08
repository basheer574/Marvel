package com.bashir.marvel.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.bashir.marvel.R
import com.bashir.marvel.databinding.FragmentSearchBinding
import com.bashir.marvel.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    override val viewModel: SearchViewModel by activityViewModels()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentSearchBinding
        = DataBindingUtil::inflate

    override fun setupView() {

    }
}