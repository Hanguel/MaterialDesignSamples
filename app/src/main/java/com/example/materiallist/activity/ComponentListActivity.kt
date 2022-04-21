package com.example.materiallist.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.KeyEventDispatcher
import com.example.materiallist.R
import com.example.materiallist.activity.appbarlayout.AppBarLayoutActivity
import com.example.materiallist.activity.viewholdertouchhelper.TouchHelperActivity
import com.example.materiallist.activity.viewpager.ViewPagerActivity
import com.example.materiallist.adapter.ComponentListAdapter
import com.example.materiallist.databinding.ActivityComponentListBinding
import com.example.materiallist.enum.ComponentType
import com.example.materiallist.model.ComponentData

class ComponentListActivity : AppCompatActivity(), ComponentListAdapter.OnItemClickListener {
    private lateinit var binding: ActivityComponentListBinding
    private lateinit var componentAdapter : ComponentListAdapter
    private var componentList = arrayListOf<ComponentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComponentListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAdapter()
        setComponentData()
    }

    private fun setAdapter() {
        componentAdapter = ComponentListAdapter(this)
        binding.rvComponent.adapter = componentAdapter
    }

    private fun setComponentData() {
        componentList.add(ComponentData(ComponentType.APP_BAR_LAYOUT, ComponentType.APP_BAR_LAYOUT.name))
        componentList.add(ComponentData(ComponentType.VIEWPAGER, ComponentType.VIEWPAGER.name))
        componentList.add(ComponentData(ComponentType.TOUCH_HELPER, ComponentType.TOUCH_HELPER.name))
        componentAdapter.setData(componentList)
    }

    override fun onItemClick(componentType: ComponentType) {
        when (componentType) {
            ComponentType.APP_BAR_LAYOUT -> { Intent(this,AppBarLayoutActivity::class.java).apply { startActivity(this) }}
            ComponentType.VIEWPAGER -> { Intent(this,ViewPagerActivity::class.java).apply { startActivity(this) }}
            ComponentType.TOUCH_HELPER -> { Intent(this,TouchHelperActivity::class.java).apply { startActivity(this) }}
        }
    }
}