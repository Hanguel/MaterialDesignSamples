package com.example.materiallist.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.materiallist.R
import com.example.materiallist.adapter.ExpandableRecyclerAdapter.*
import com.example.materiallist.componenets.model.MenuType

class ComponentListTempAdapter(context: Context, items: ArrayList<ListItem>, onItemClickListener: AdapterView.OnItemClickListener) {
//    ExpandableRecyclerAdapter<ComponentListTempAdapter.ListItem>(context) {
//    private lateinit var context: Context
//    private lateinit var onItemClickListener: AdapterView.OnItemClickListener
//
//    init {
//        this.context = context
//        this.onItemClickListener = onItemClickListener
//        setItems(items)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val divider = View(context)
//        divider.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 2)
//        divider.setBackgroundColor(context.resources.getColor(R.color.grey_60, null))
//        return when (viewType) {
//            NORMAL -> PlainViewHolder(inflate(R.layout.item_menu_plain, parent))
//            HEADER -> HeaderViewHolder(inflate(R.layout.item_menu_group, parent))
//            SUB_HEADER -> SubHeaderViewHolder(inflate(R.layout.item_menu_sub_group, parent))
//            DIVIDER -> DividerViewHolder(inflate(R.layout.item_menu_divider, parent))
//            else -> PlainViewHolder(inflate(R.layout.item_menu_group, parent))
//        }
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//    }
//
//    class ListItem : ExpandableRecyclerAdapter.ListItem {
//        var Id = -1
//        var Icon = -1
//        var Text: String
//        var New = false
//
//        constructor(id: Int, title: String, icon: Int, type: MenuType) : super(type.value) {
//            Id = id
//            Text = title
//            Icon = icon
//        }
//
//        constructor(
//            id: Int,
//            title: String,
//            icon: Int,
//            isNew: Boolean,
//            type: MenuType
//        ) : super(type.value) {
//            Id = id
//            Text = title
//            Icon = icon
//            New = isNew
//        }
//    }
//
//    /**
//     * ClassView for menu with icon and text
//     */
//    inner class PlainViewHolder(var view: View) : ExpandableRecyclerAdapter<ListItem>.ViewHolder(view) {
//        var name: TextView = view.findViewById<View>(R.id.item_menu_group_name) as TextView
//        var icon: ImageView = view.findViewById<View>(R.id.item_menu_group_image) as ImageView
//
//        fun bind(position: Int) {
//            name.text = visibleItems[position].Text
//            icon.setImageResource(visibleItems[position].Icon)
//
//            view.setOnClickListener { view ->
//                onItemClickListener.onItemClick(view, visibleItems[position].Id)
//            }
//        }
//    }
//
//    /**
//     * ClassView for menu with icon, text and expandable feature
//     */
//    class HeaderViewHolder(view: View) : ExpandableRecyclerAdapter.HeaderViewHolder(view, view.findViewById<View>(R.id.item_arrow) as ImageView) {
//        var name: TextView = view.findViewById<View>(R.id.item_menu_group_name) as TextView
//        var icon: ImageView = view.findViewById<View>(R.id.item_menu_group_image) as ImageView
//        var badge: ImageView = view.findViewById<View>(R.id.item_menu_group_badge) as ImageView
//
//        fun bind(position: Int) {
//            super.bind(position)
//            name.setText(visibleItems.get(position).Text)
//            icon.setImageResource(visibleItems.get(position).Icon)
//            badge.visibility = if (visibleItems.get(position).New) View.VISIBLE else View.INVISIBLE
//        }
//    }
//
//    /**
//     * ClassView for menu with text and sub header from HeaderViewHolder
//     */
//    class SubHeaderViewHolder(var view: View) : ViewHolder(
//        view
//    ) {
//        var name: TextView
//        var badge: ImageView
//        fun bind(position: Int) {
//            name.setText(visibleItems.get(position).Text)
//            view.setOnClickListener { view ->
//                onItemClickListener.onItemClick(
//                    view,
//                    visibleItems.get(position).Id
//                )
//            }
//            badge.visibility = if (visibleItems.get(position).New) View.VISIBLE else View.INVISIBLE
//        }
//
//        init {
//            name = view.findViewById<View>(R.id.item_menu_sub_group_name) as TextView
//            badge = view.findViewById<View>(R.id.item_menu_sub_group_badge) as ImageView
//        }
//    }
//
//    /**
//     * ClassView for menu divider line
//     */
//    class DividerViewHolder(view: View) : ViewHolder(view) {
//        var name: TextView
//        fun bind(position: Int) {
//            if (visibleItems.get(position).Text == null) {
//                name.visibility = View.GONE
//            } else {
//                name.visibility = View.VISIBLE
//                name.setText(visibleItems.get(position).Text)
//            }
//        }
//
//        init {
//            name = view.findViewById<View>(R.id.item_menu_divider_name) as TextView
//        }
//    }
//
//    fun setItems(items: ArrayList<T>) {
//
//    }
//
//
//    fun setOnItemClickListener(onItemClickListener: AdapterView.OnItemClickListener) {
//        this.onItemClickListener = onItemClickListener
//    }
//
//    interface OnItemClickListener {
//        fun onItemClick(view: View, itemId : Int)
//    }
}