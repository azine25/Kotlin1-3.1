package com.geek.kotlin13.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.geek.kotlin13.MainViewModel
import com.geek.kotlin13.base.BaseFragment
import com.geek.kotlin13.databinding.FragmentListBinding
import com.geek.kotlin13.ui.adapters.MyAdapter

class ListFragment : BaseFragment<FragmentListBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        liveData.observer.observe(requireActivity(), {
            binding.recList.adapter = MyAdapter(liveData.getHistory())
        })
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun bind(): FragmentListBinding {
        return FragmentListBinding.inflate(layoutInflater)
    }

}