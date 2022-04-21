package com.example.materiallist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.materiallist.R
import com.example.materiallist.activity.ComponentListActivity
import com.example.materiallist.databinding.ItemMenuGroupBinding
import com.example.materiallist.enum.ComponentType
import com.example.materiallist.model.ComponentData
import com.example.materiallist.viewholder.ComponentViewHolder

class ComponentListAdapter(onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<ComponentViewHolder>() {
    interface OnItemClickListener {
        fun onItemClick(componentType: ComponentType)
    }

    private var items = arrayListOf<ComponentData>()
    private var onItemClickListener : OnItemClickListener? = null

    init {
        this.onItemClickListener = onItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentViewHolder {
        return ComponentViewHolder(ItemMenuGroupBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ComponentViewHolder, position: Int) {
        with(holder) {
            bind(items[position])
            itemView.setOnClickListener {
                onItemClickListener?.onItemClick(items[position].type)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(items : ArrayList<ComponentData>) {
        this.items = items
        notifyDataSetChanged()
    }
}