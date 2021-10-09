package com.geek.kotlin13.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geek.kotlin13.databinding.ActivityMainBinding
import com.geek.kotlin13.ui.adapters.PagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pager.adapter = PagerAdapter(this)

    }
}