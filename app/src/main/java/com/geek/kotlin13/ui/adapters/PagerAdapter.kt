package com.geek.kotlin13.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.geek.kotlin13.ui.fragments.ButtonsFragment
import com.geek.kotlin13.ui.fragments.ListFragment
import com.geek.kotlin13.ui.fragments.ResultFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val listFragment = listOf<Fragment>(
        ButtonsFragment(),
        ResultFragment(),
        ListFragment()
    )

    override fun getItemCount(): Int = listFragment.size

    override fun createFragment(position: Int): Fragment {
        return listFragment[position]
    }

}