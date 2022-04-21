package com.test.viewholdertouchhelper.recyclerAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.materiallist.activity.viewholdertouchhelper.SwipeAndDragHelper
import com.example.materiallist.databinding.ItemCardViewBinding
import com.test.viewholdertouchhelper.data.RecyclerData

class TouchHelperRecyclerViewAdapter(private val data: ArrayList<RecyclerData>) : RecyclerView.Adapter<TouchHelperRecyclerViewAdapter.ViewHolder>(),
    SwipeAndDragHelper.ActionCompletionContract {
    private lateinit var mTouchHelper: ItemTouchHelper

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TouchHelperRecyclerViewAdapter.ViewHolder, position: Int) {
        data[position].let { item ->
            holder.bind(item)
        }
    }

    inner class ViewHolder(var binding : ItemCardViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data : RecyclerData) {
            binding.tvCardViewText.text = data.text
        }
    }

    override fun onViewMoved(oldPosition: Int, newPosition: Int) {
        var targetData = data[oldPosition]
        var newData = RecyclerData(targetData.text)
        data.removeAt(oldPosition)
        data.add(newPosition, newData)
        notifyItemMoved(oldPosition, newPosition)
        notifyItemChanged(oldPosition)
        notifyItemChanged(newPosition)
    }

    override fun onViewSwiped(position: Int) {
        data.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, data.size)
    }

    fun setTouchHelper(mTouchHelper: ItemTouchHelper) {
        this.mTouchHelper = mTouchHelper
    }
}