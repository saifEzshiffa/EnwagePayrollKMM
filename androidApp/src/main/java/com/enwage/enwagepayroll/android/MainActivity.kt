package com.enwage.enwagepayroll.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.enwage.enwagepayroll.android.databinding.MainActivityBinding

class MainActivity : ComponentActivity() {
    lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


