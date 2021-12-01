package com.bashir.marvel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.bashir.marvel.R
import com.bashir.marvel.data.local.MarvelDataBase
import com.bashir.marvel.databinding.ActivityMarvelBinding
import com.bashir.marvel.util.Constants

class MarvelActivity : AppCompatActivity() {
    lateinit var binding: ActivityMarvelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_marvel)
        MarvelDataBase.init(applicationContext)
        Log.i("TS",Constants.TS)
        Log.i("Time Stamps",Constants.HASH_SIGNATURE)
    }
}