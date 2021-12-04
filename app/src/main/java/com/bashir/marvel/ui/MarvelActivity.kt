package com.bashir.marvel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.bashir.marvel.R
import com.bashir.marvel.data.local.MarvelDataBase
import com.bashir.marvel.databinding.ActivityMarvelBinding
import com.bashir.marvel.util.Constants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MarvelActivity : AppCompatActivity() {
    lateinit var binding: ActivityMarvelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_marvel)
        MarvelDataBase.init(applicationContext)
    }

    override fun onResume() {
        super.onResume()
        val navController = findNavController(R.id.parent_container)
        binding.bottomNavBar.setupWithNavController(navController)
    }
}