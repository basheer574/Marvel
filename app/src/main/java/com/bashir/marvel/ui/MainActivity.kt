package com.bashir.marvel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bashir.marvel.R
import com.bashir.marvel.databinding.ActivityMarvelBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMarvelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_marvel)
    }
}