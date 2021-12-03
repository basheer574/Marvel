package com.bashir.marvel.ui.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.bashir.marvel.R
import com.bashir.marvel.databinding.FragmentCharaterShowMoreBinding
import com.bashir.marvel.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CharacterFragment :
    BaseFragment<FragmentCharaterShowMoreBinding>(R.layout.fragment_charater_show_more) {
    override val viewModel: CharacterViewModel by viewModels()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) ->

    FragmentCharaterShowMoreBinding = DataBindingUtil::inflate

    override fun setupView() {
        binding.let {
            it.viewModel = viewModel
            it.characterRecyclerView.adapter = CharacterAdapter(mutableListOf(),viewModel)
        }
    }
}