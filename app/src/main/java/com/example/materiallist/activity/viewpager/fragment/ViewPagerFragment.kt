package com.example.materiallist.activity.viewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materiallist.databinding.FragmentViewpagerBinding

class ViewPagerFragment(var text: String) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var fragmentBinding = FragmentViewpagerBinding.inflate(layoutInflater)

        with(fragmentBinding) {
            tvFragmentTextView.text = text
        }

        return fragmentBinding.root
    }
}