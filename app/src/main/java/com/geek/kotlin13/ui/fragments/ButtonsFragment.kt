package com.geek.kotlin13.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.geek.kotlin13.MainViewModel
import com.geek.kotlin13.base.BaseFragment
import com.geek.kotlin13.databinding.FragmentButtonsBinding

class ButtonsFragment : BaseFragment<FragmentButtonsBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.increment.setOnClickListener {
            liveData.increment()
        }
        binding.decrement.setOnClickListener {
            liveData.decrement()
        }
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun bind(): FragmentButtonsBinding {
        return FragmentButtonsBinding.inflate(layoutInflater)
    }
}