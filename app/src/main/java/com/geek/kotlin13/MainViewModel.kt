package com.geek.kotlin13

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0
    private var liveData = MutableLiveData<Int>()
    var observer: LiveData<Int> = liveData
    private var list = mutableListOf<String>()

    fun increment() {
        counter++
        liveData.value = counter
        list.add("+")
    }

    fun decrement() {
        counter--
        liveData.value = counter
        list.add("-")
    }

    fun getHistory():List<String>{
        return list
    }

}