package com.example.materiallist.activity.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.materiallist.activity.viewpager.fragment.ViewPagerFragment

class PagerAdapter : FragmentPagerAdapter{

    constructor(fm: FragmentManager, behavior: Int) : super(fm, behavior)

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> ViewPagerFragment("First Fragment")
            1 -> ViewPagerFragment("Second Fragment")
            2 -> ViewPagerFragment("Third Fragment")
            3 -> ViewPagerFragment("Fourth Fragment")
            else -> Fragment()
        }
    }

    override fun getCount(): Int {
        return 4
    }
}