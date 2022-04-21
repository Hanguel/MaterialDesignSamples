package com.example.materiallist.activity.viewholdertouchhelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.materiallist.databinding.ActivityTouchHelperBinding
import com.test.viewholdertouchhelper.data.RecyclerData
import com.test.viewholdertouchhelper.recyclerAdapter.TouchHelperRecyclerViewAdapter

/**
 * itemTouchHelper 클래스는 recyclerview만 사용 가능함
 *
 * */

class TouchHelperActivity : AppCompatActivity() {
    private lateinit var binding : ActivityTouchHelperBinding
    private var data = arrayListOf<RecyclerData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTouchHelperBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
        setAdapter()
    }

    private fun setAdapter() {
        var recyclerAdapter = TouchHelperRecyclerViewAdapter(data)
        var swipeAndDragHelper = SwipeAndDragHelper(recyclerAdapter)
        var touchHelper = ItemTouchHelper(swipeAndDragHelper)
        recyclerAdapter.setTouchHelper(touchHelper)
        touchHelper.attachToRecyclerView(binding.rvRecyclerView)
        binding.rvRecyclerView.adapter = recyclerAdapter
    }

    private fun setData() {
        for (i in 0 until 10) {
            data.add(RecyclerData("$i"))
        }
    }
}
