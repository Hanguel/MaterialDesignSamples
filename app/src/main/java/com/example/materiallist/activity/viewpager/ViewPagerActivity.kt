package com.example.materiallist.activity.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.materiallist.databinding.ActivityViewpagerBinding
import com.example.materiallist.activity.viewpager.adapter.PagerAdapter
import com.test.viewpager.transformer.RotatePagerTransformer

/**
 * 기본적인 뷰페이저의 구성에 PageTranformer를 추가
 * */

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var binding : ActivityViewpagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            vpViewPager.adapter = PagerAdapter(supportFragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
            vpViewPager.setPageTransformer(false, RotatePagerTransformer())
            vpViewPager.currentItem = 0
            vpViewPager.addOnPageChangeListener(mOnPageChangeListener)
        }
    }

    var mOnPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        }

        override fun onPageSelected(position: Int) {
        }
    }
}
