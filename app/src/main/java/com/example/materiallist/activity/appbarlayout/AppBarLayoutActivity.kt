package com.example.materiallist.activity.appbarlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materiallist.databinding.ActivityAppBarLayoutBinding
import com.test.viewholdertouchhelper.data.RecyclerData

/**
 * AppBar가 collapse되기 위해서는 스크롤이 되는 뷰가 필요함 (recyclerview, listview 등등...)
 * 1.recyclerview에 layout_behavior에 scroll behavior를 등록한다.
 * 2. CollapsingToolbarLayout의 layout_scrollFlags 에 scroll이 있으므로 리사이클러뷰를 스크롤하면 appbar가 그것에 반응한다.
 *      exitUntilCollapsed -> appbar가 완전히 사라지는것이 아닌 정해둔 최소높이에 도달하면 변화x
 * 3. CollapsingToolbarLayout 안의 imageView에 layout_collapseMode 속성에 parallax 줌으로써 appbar의 배경색이 스크롤에 따라 변한다.
 * */

class AppBarLayoutActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAppBarLayoutBinding
    private var data = arrayListOf<RecyclerData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBarLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
        setAdapter()
    }

    private fun setAdapter() {
        binding.rvRecyclerView.adapter = RecyclerViewAdapter(data)
    }

    private fun setData() {
        for (i in 0 until 10) {
            data.add(RecyclerData("$i"))
        }
    }
}