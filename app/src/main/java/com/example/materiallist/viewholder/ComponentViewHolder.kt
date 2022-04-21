package com.example.materiallist.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.materiallist.BR
import com.example.materiallist.databinding.ItemMenuGroupBinding
import com.example.materiallist.model.ComponentData

class ComponentViewHolder(private val binding : ItemMenuGroupBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(data : ComponentData) {
        with(binding) {
            setVariable(BR.componentData, data)
        }
    }
}