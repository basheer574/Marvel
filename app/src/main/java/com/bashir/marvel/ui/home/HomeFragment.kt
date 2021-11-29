package com.bashir.marvel.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.bashir.marvel.R
import com.bashir.marvel.databinding.FragmentHomeBinding
import com.bashir.marvel.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override val viewModel by activityViewModels<HomeViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentHomeBinding
        = DataBindingUtil::inflate

    override fun setupView() {

    }
}