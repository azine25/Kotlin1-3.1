package com.geek.kotlin13.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.geek.kotlin13.MainViewModel

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    lateinit var binding: VB
    lateinit var liveData: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = bind()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        liveData = initLiveData()
    }

    abstract fun initLiveData(): MainViewModel

    abstract fun bind(): VB

}