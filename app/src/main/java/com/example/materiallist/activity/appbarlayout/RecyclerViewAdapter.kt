package com.example.materiallist.activity.appbarlayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.materiallist.databinding.ItemCardViewBinding
import com.test.viewholdertouchhelper.data.RecyclerData

class RecyclerViewAdapter(private val data: ArrayList<RecyclerData>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        data[position].let { item ->
            holder.bind(item)
        }
    }

    inner class ViewHolder(var binding : ItemCardViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data : RecyclerData) {
            binding.tvCardViewText.text = data.text
        }
    }
}