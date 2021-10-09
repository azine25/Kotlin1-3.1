package com.geek.kotlin13.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.geek.kotlin13.MainViewModel
import com.geek.kotlin13.base.BaseFragment
import com.geek.kotlin13.databinding.FragmentResultBinding


class ResultFragment : BaseFragment<FragmentResultBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        liveData.observer.observe(requireActivity(), {
            binding.tvResult.text = it.toString()
        })
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun bind(): FragmentResultBinding {
        return FragmentResultBinding.inflate(layoutInflater)
    }
}
